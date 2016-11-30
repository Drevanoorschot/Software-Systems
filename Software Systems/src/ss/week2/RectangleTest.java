package ss.week2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertTrue;
//import static org.junit.Assert.assertFalse;

public class RectangleTest {
	private Rectangle r1;
	private Rectangle r2;
	
	@Before
	public void setUp() {
		r1 = new Rectangle(10, 20);
		r2 = new Rectangle(-1, -7);
	}
	@Test
	public void testInitialcondition() {
		assertEquals(10, r1.length());
		assertEquals(20, r1.width());
		assertEquals(0, r2.length());
		assertEquals(0, r2.length());
	}
	@Test
	public void testLength() {
		assertEquals(10, r1.length());
		assertEquals(0,  r2.length());
	}
	@Test
	public void testWidth() {
		assertEquals(20, r1.width());
		assertEquals(0, r2.width());
	}
	@Test
	public void testArea() {
		assertEquals(200, r1.area());
		assertEquals(0, r2.area());
	}
	@Test
	public void testPerimeter() {
		assertEquals(60, r1.perimeter());
		assertEquals(0, r2.perimeter());
	}
	
}
