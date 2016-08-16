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
}

