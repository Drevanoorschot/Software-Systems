package ss.week7.account;

public class Account {
	protected double balance = 0.0;

	public synchronized void transaction(double amount) {
		if (balance + amount < -1000) {
			try {
				while (balance + amount < -1000) {
					wait();
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		balance = balance + amount;
		notifyAll();
	}
	public double getBalance() {
		return balance;

	}
}
