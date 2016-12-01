package ss.week3.test;

import static org.junit.Assert.*;
import ss.week3.hotel.*;

import org.junit.Test;

public class BillTest {
	private Bill bill;
	private Banana banana;

	@Test
	public void test() {
		bill = new Bill(System.out);
		banana = new Banana("testString", 4.30);
		bill.newItem(banana);
		assertEquals(bill.getSum(), 4.30, 0.00001);

	}

}
