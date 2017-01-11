package ss.week7.threads;

import java.util.concurrent.locks.ReentrantLock;

public class TestSyncConsole extends Thread {
	private String name;
	private static ReentrantLock lock = new ReentrantLock();
	public static void main(String[] args) {
		TestSyncConsole console1 = new TestSyncConsole("1");
		TestSyncConsole console2 = new TestSyncConsole("2");
		lock.lock();
		console1.start();
		lock.unlock();
		lock.lock();
		console2.start();
		lock.unlock();
		

	}

	public TestSyncConsole(String cn) {
		name = cn;
	}

	public void run() {
		//lock.lock();
		sum();
		//lock.unlock();
	}
/*
 * 7.11) the threads overlap changing the same variable before the final variable
 * is calculated for the first thread.
 * 
 * 7.12) the answers to the sums are now correct but the order of the questions is
 * still odd.
 * 
 * 7.14.1) you can lock threads wherever you want (in the middle of methods for example)
 * 7.14.2) yes, synchronized gives you less control
 * 7.14.3) you can lock threads wherever you want (in the middle of methods for example)
 * 7.14.4) You can easily lose track of where your lock is.
 */
	private void sum() {
		//lock.lock();
		int one = SyncConsole.readInt(getName() + ": get number 1?");
		int two = SyncConsole.readInt(getName() + ": get number 2?");
		int answer = one + two;
		SyncConsole.println(getName() + ": " + one + " + " + two + " = " + answer);
		//lock.unlock();
	}
}
