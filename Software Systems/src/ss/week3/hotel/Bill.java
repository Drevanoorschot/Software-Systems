package ss.week3.hotel;

import java.io.PrintStream;

public class Bill {
	public PrintStream outstream;
	public double sum;
	public Bill.Item billItem;

	static interface Item {
		public double getAmount();
	}

	public Bill(PrintStream theOutStream) {
		outstream = theOutStream;
	}

	public void close() {
		outstream.println(getSum());
	}

	public double getSum() {
		return sum;
	}

	public void newItem(Bill.Item item) {
		sum = sum + item.getAmount();
		outstream.println(item.toString());
	}
}
