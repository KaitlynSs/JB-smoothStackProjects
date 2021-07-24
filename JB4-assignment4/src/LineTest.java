import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;

public class LineTest {

	@Test
	public void testGetSlope() {
		//test 1
		Line l1 = new Line(0, 0, 4, 4);
		assertEquals("get slope test 1: positive slope", 1, l1.getSlope(), 0.0001);
			
		//test 2
		l1 = new Line(1, 1, 5, 1);
		assertEquals("get slope test 2: no slope", 0, l1.getSlope(), 0.0001);
			
			
		//test 3
		l1 = new Line(0, 0, 4, -4);
		assertEquals("get slope test 3: negitive slope", -1, l1.getSlope(), 0.0001);
	}	

	@Test
	public void testGetDistance() {
		//test 1
		Line l2 = new Line(0, 0, 4, 0);
		assertEquals("get distance test 1: straight line ", 4, l2.getDistance(), 0.0001);
		
		//test 2
		l2 = new Line(0, 0, -4, 0);
		assertEquals("get distance test 2: negitive distance ", 4, l2.getDistance(), 0.0001);
		
		//test 3
		l2 = new Line(0, 0, 4, 4);
		assertEquals("get distance test 3: angled line ", 5.656854, l2.getDistance(), 0.0001);
		
		//test 4
		l2 = new Line(1, 1, 1, 1);
		assertEquals("get distance test 4: no line", 0, l2.getDistance(), 0.0001);
	}

	@Test
	public void testParallelTo() {
		//test 1
		Line l3 = new Line(0, 1, 1, 1);
		Line l4 = new Line(0, 4, 1, 4);
		assertTrue("parallel to test 1: parallel lines", l3.parallelTo(l4));
		
		//test 2
		l3 = new Line(0, 1, 1, 1);
		l4 = new Line(0, 4, 1, 4.0001);
		assertTrue("parallel to test 2: parallel lines off by 0.0001", l3.parallelTo(l4));
				
		//test 3
		l3 = new Line(0, 1, 1, 1);
		l4 = new Line(0, 4, 1, 5);
		assertFalse("parallel to test 3: not parallel lines", l3.parallelTo(l4));
		
		//test 4
		l3 = new Line(0, 1, 1, 1);
		l4 = new Line(0, 1, 1, 1);
		assertTrue("parallel to test 4: same line", l3.parallelTo(l4));
	}
	
	@Test(expected = ArithmeticException.class)
	public void testGetSlopeArithmeticException() {
		//test 1
		Line l5 = new Line(1, 1, 1, 1);
		l5.getSlope();
	}
}
