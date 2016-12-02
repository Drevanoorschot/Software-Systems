package ss.week3.test;

import static org.junit.Assert.*;
import ss.week3.hotel.*;

import org.junit.Test;

public class BillTest {
	private Bill bill;
	private Banana banana;
	private Banana banana2;

	@Test
	public void test() {
		bill = new Bill(System.out);
		banana = new Banana("testString", 4.30);
		banana2 = new Banana("test", 54.40);
		bill.newItem(banana);
		bill.newItem(banana2);
		bill.close();
		assertEquals(bill.getSum(), 58.70, 0.00001);

	}

}
