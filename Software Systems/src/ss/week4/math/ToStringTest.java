package ss.week4.math;

import java.util.ArrayList;
import java.util.List;

public class ToStringTest {
	public static void main(String[ ] args) {
		List<Double> list = new ArrayList<Double>();
		list.add(4.00);
		list.add(6.00);
		list.add(2.0);
		Constant f = new Constant(2);
		System.out.println(f.integrand().toString());
	}
}
