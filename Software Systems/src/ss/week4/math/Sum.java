package ss.week4.math;

public class Sum implements Function {
	private Function fx;
	private Function gx;
	public Sum(Function f, Function g) {
		gx = g;
		fx = f;
	}
	public Sum derivative() {
		return new Sum(fx.derivative(), gx.derivative());
	}
	public String toString() {
		return this.toString();
	}
	@Override
	public double apply(double c) {
		return fx.apply(c) + gx.apply(c);
	}

}
