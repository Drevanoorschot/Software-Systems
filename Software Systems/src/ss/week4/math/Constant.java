package ss.week4.math;

public class Constant implements Function {
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
		return this.toString();
	}
}
