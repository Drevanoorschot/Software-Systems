package ss.week7.threads;

public class SynchronizedIntCell implements IntCell {
	private int value;
	private static boolean unconsumed = false;

	@Override
	public synchronized void setValue(int val) {
		if (unconsumed) {
			try {
				while (unconsumed) {
					//notify();
					wait();
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
		value = val;
		unconsumed = true;
		notifyAll();

	}

	@Override
	public synchronized int getValue() {
		if (!unconsumed) {
			try {
				while (!unconsumed) {
					//notify();
					wait();
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		unconsumed = false;
		notifyAll();
		return value;
	}

}
