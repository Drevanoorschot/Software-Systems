package ss.week7.threads;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class FinegrainedIntCell implements IntCell {
	private int value;
	static boolean full = false;
	final Lock lock = new ReentrantLock();
	final Condition consumed = lock.newCondition();
	final Condition unconsumed = lock.newCondition();
	
	@Override
	public void setValue(int val) {
		lock.lock();
		try {
			while (full) {
				unconsumed.await();
			}
			value = val;
			full = true;
			consumed.signal();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}

		
		
	}

	@Override
	public int getValue() {
		lock.lock();
		try {
			while (!full) {
				consumed.await();
			}
			full = false;
			unconsumed.signal();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
		return value;
		
	}

}
