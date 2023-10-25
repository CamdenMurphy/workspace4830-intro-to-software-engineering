package p1.computation;

import org.junit.Assert;
import org.junit.Test;

public class TestComputation {
	@Test
	public void testGetDiscount() throws Exception {
		Computation com = new Computation();
		int input1 = 100, input2 = 2;
		int expected = 30;
		int result = com.getDiscount(input1, input2);
		Assert.assertEquals(expected, result);
	}
}
