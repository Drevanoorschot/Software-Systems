package ss.week7.account;

public class AccountSync {
	public static void main(String[] args) {
		Account account = new Account();
		Thread t1 = new MyThread(500, 10, account);
		Thread t2 = new MyThread(-500, 10, account);
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(account.getBalance());
	}
}
/*
 *7.19.6) You'd have to make a runnable instance in a thread instead of only making a thread. 
*/