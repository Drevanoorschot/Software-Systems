package ss.week4.math;

public class Constant implements Function, Integrandable {
	double constant;
	Constant function;

	public Constant(double c) {
		constant = c;
	}

	public double apply(double c) {
		return constant;
	}

	public Constant derivative() {
		return new Constant(0);
	}

	public String toString() {
		return String.valueOf(constant);
	}

	@Override
	public Function integrand() {
		return new LinearProduct(new Exponent(1), function);
	}
}
