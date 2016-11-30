package ss.week2.test;
import ss.week2.hotel.Safe;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SafeTest {
	public Safe s1;
	public Safe s2;
	public Safe s3;
	public Safe s4;
	public Safe s5;
	public Safe s6;
//	public Safe s7;
	public static String pw = "testtest";
	public static String wpw = "random123";
	
	@Before
	public void setUp() throws Exception {
		s1 = new Safe();
		s2 = new Safe();
		s3 = new Safe();
		s4 = new Safe();
		s5 = new Safe();
		s6 = new Safe();
//		s7 = new Safe();
		
		s1.activate(pw);
		s1.open(pw);
		
		s2.activate(pw);
		s2.deactivate();
		s2.open(pw);
		
		s4.activate(pw);
		s4.open(pw);
		s4.close();
		
		s5.activate(wpw);
		
		s6.activate(pw);
		s6.open(wpw);
		

	}

	@Test
	public void testActivate() {
		assertTrue(s1.isActive());
		assertFalse(s2.isActive());
		assertFalse(s3.isActive());
		assertFalse(s5.isActive());
		assertTrue(s6.isActive());
		
	}
	@Test
	public void testOpen() {
		assertTrue(s1.isOpen());
		assertFalse(s2.isOpen());
		assertFalse(s3.isOpen());
		assertFalse(s4.isOpen());
		assertFalse(s6.isOpen());
	}
//	@Test
//	public void testClose() {
//		assertTrue()
//	}

}
