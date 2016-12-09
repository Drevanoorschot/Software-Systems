package ss.week4.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import ss.week4.math.Polynomial;

public class PolynomialTest {

	public static final List<Double> ARGS = new ArrayList<Double>();
	private static final double DELTA = 1e-15;

	@Before
	public void setup() {
		ARGS.clear();
		ARGS.add(4.00);
		ARGS.add(6.00);
		ARGS.add(2.00);
	}

	@Test
	public void testApply() {
		assertEquals(132, new Polynomial(ARGS).apply(5), DELTA);
		assertEquals(2, new Polynomial(ARGS).apply(0), DELTA);
		assertEquals(72, new Polynomial(ARGS).apply(-5), DELTA);
	}

	@Test
	public void testDerivative() {
		assertEquals(46, new Polynomial(ARGS).derivative().apply(5), DELTA);
		//assertEquals(6, new Polynomial(ARGS).derivative().apply(0), DELTA);
		assertEquals(-34, new Polynomial(ARGS).derivative().apply(-5), DELTA);
	}
	@Test
	public void testIntegrand() {
		assertEquals(251.66666666666667, new Polynomial(ARGS).integrand().apply(5), DELTA);
	}

}
