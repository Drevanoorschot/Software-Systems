package ss.week4.math;

import java.util.*;

public class Polynomial implements Function, Integrandable {
	private List<LinearProduct> array;

	public Polynomial(List<Double> arguments) {
		array = new ArrayList<LinearProduct>();
		for (int i = 0; i < arguments.size(); i++) {
			array.add(new LinearProduct(new Exponent(arguments.size() - i - 1), 
					new Constant(arguments.get(i))));
		}
	}

	@Override
	public double apply(double c) {
		double total = 0;
		for (int i = 0; i < array.size(); i++) {
			total = total + (array.get(i).apply(c));
		}
		return total;
	}

	@Override
	public Function derivative() {
		Function f = null;
		for (int i = 0; i < array.size(); i++) {
			Function a = array.get(i).derivative();
			if (f == null) {
				f = a;
			} else {
				f = new Sum(f, a);
			}
		}
		return f;
	}

	@Override
	public String toString() {
		String s = "";
		for (int i = 0; i < array.size(); i++) {
			if (s.equals("")) {
				s = s + array.get(i).toString();
			} else {
				s = s + " + " + array.get(i).toString();
			}
		}
		return s;
	}

	@Override
	public Function integrand() {
		Function f = null;
		for (int i = 0; i < array.size(); i++) {
			if (array.get(i) instanceof Integrandable) {
				Function a = array.get(i).integrand();
				if (f == null) {
					f = a;
				} else {
					f = new Sum(f, a);
				}
			} else {
				return null;
			}
			
		}
		return f;
	}
}
