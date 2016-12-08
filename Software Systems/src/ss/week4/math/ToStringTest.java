package ss.week4.math;

import java.util.ArrayList;
import java.util.List;

public class ToStringTest {
	public static void main(String[ ] args) {
		List<Double> list = new ArrayList<Double>();
		list.add(1.00);
		list.add(2.00);
		list.add(4.0);
		Polynomial f = new Polynomial(list);
		System.out.println(f.toString());
	}
}
