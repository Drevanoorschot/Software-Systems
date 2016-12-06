package ss.week4.math;

public class Sum implements Function {
	double fx;
	double gx;
	public Sum(double f, double g) {
		gx = g;
		fx = f;
	}
	public Sum derivative() {
		return new Sum(0, 0);
	}
	public String toString() {
		return this.toString();
	}
	@Override
	public double apply(double c) {
		return fx + gx;
	}

}
