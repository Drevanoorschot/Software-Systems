package ss.week4.math;

public class Product implements Function {
	private Function gx;
	private Function fx;

	public Product(Function f, Function g) {
		fx = f;
		gx = g;
	}

	@Override
	public double apply(double c) {
		return fx.apply(c) * gx.apply(c);
	}

	@Override
	public Sum derivative() {
		return new Sum(new Product(fx.derivative(), gx), new Product(fx, gx.derivative()));
	}
	public String toString() {
		return fx.toString() + " * " + gx.toString();
	}
}
