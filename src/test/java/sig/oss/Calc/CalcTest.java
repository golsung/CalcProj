package sig.oss.Calc;

import static org.junit.Assert.*;
import org.junit.Test;

public class CalcTest {

	@Test
	public void testAdd() {
		Calc c = new Calc();
        c.add(10, 20);
		assertEquals(30, c.getResult());
	}
	
	@Test
	public void testSub() {
		Calc c = new Calc();
        c.sub(10, 20);
		assertEquals(-10, c.getResult());
	}
	
	@Test
	public void testmul() {
		Calc c = new Calc();
        c.sub(10, 20);
		assertEquals(200, c.getResult());
	}
}

