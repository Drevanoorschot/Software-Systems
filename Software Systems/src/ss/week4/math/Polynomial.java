package ss.week4.math;

import java.util.*;

public class Polynomial implements Function {
	private List<LinearProduct> array;
	private Function fx;

	public Polynomial(double[] arguments) {
		for (int i = 0; i < arguments.length; i++) {
			array.add(new LinearProduct(new Exponent(arguments.length - i), 
					new Constant(arguments[i])));
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
/*	public Function derivative() {
		Function derivedItem; 
		LinearProduct castedDerivedItem;
		List<LinearProduct> derivedArray = new ArrayList<LinearProduct>();
		for (int i = 0; i < array.size(); i++) {
			derivedItem = array.get(i).derivative();
			castedDerivedItem = (LinearProduct) derivedItem;
			derivedArray.add(castedDerivedItem);
		}
		return null;
	}
	*/
	public Function derivative() {
		return new Polynomial(
	}
}
