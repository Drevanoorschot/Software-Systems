package ss.week4.math;

public class LinearProduct implements Function, Integrandable {
	private Function fx;
	private Constant n;
	
	public LinearProduct(Function f, Constant constant) {
		fx = f;
		n = constant;
	}
	@Override
	public double apply(double c) {
		return n.apply(c) * fx.apply(c);
	}

	@Override
	public Function derivative() {
		return new LinearProduct(fx.derivative(), n);
	}
	
	public String toString() {
		return n.toString() + " * " + fx.toString();
	}
	@Override
	public Function integrand() {
		if (fx instanceof Integrandable) {
			return new LinearProduct(((Integrandable) fx).integrand(), n);
		} else {
			return null;
		}
	}
	
}
