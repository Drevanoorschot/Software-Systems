package ss.week4.math;

public class Sum implements Function, Integrandable {
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
		return gx.toString() + " + " + fx.toString();
	}
	@Override
	public double apply(double c) {
		return fx.apply(c) + gx.apply(c);
	}
	@Override
	public Function integrand() {
		if (fx instanceof Integrandable && gx instanceof Integrandable) {
			return new Sum(((Integrandable) fx).integrand(), ((Integrandable) gx).integrand());
		} else {
			return null;
		}
	}
	
	

}
