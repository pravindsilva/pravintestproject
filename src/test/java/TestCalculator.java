import static org.junit.Assert.*;

import org.junit.Test;


public class TestCalculator {

	@Test
	public void test() {
		RunCalculator r=new RunCalculator();
		assertEquals(11,r.runCalculator(5, 4));
	}
}
