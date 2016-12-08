package ss.week4.math;

public class Exponent implements Function, Integrandable {
	private Integer n;
	
	public Exponent(Integer exponent) {
		n = exponent;
	}
	
	@Override
	public double apply(double c) {
		return Math.pow(c, n);
	}

	@Override
	public Function derivative() {
		return new LinearProduct(new Exponent(n - 1), new Constant(n));
	}
	
	public String toString() {
		return "x^" + n; 
	}

	@Override
	public Function integrand() {
		return new LinearProduct(new Exponent(n + 1), new Constant(1 / (n + 1)));
	}
	 
 
}
