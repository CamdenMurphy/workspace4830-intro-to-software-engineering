package p2.parameterization;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/* The custom runner 'Parameterized' implements parameterized tests.  */
@RunWith(Parameterized.class)
public class TestCustomer_Parameterized {
   int mInput1, mInput2, mExpected;
   Customer customer = new Customer();

   /*
   * When running a parameterized test class, instances are created 
   * for the test methods
   */
   @Parameters
   public static Collection<Object[]> data() {
      return Arrays.asList(new Object[][] { //
            { 0, 0, 0 }, // 1st input, 2nd input, expected value
            { 1, 1, 2 }, //
            { 2, 1, 3 } });
   }

   public TestCustomer_Parameterized(int input1, int input2, int expected) {
      this.mInput1 = input1;
      this.mInput2 = input2;
      this.mExpected = expected;
   }

   @Test
   public void testWithParameters() {
      int actualResult = customer.getValue(mInput1, mInput2);
      Assert.assertEquals(mExpected, actualResult);
   }
}