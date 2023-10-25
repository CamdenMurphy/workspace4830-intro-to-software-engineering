package q1.computation;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class TestComputation_Parameterized {
   int mInput1, mInput2, mExpected;
   Computation com = new Computation();

   @Parameters
   public static Collection<Object[]> data() {
      return Arrays.asList(new Object[][] { //
    	  {100,1,20},
    	  {101,2,30},
    	  {102,3,40}
            });
   }

   public TestComputation_Parameterized(int input1, int input2, int expected) {
 	  // TODO: Write Your Answer
	   this.mInput1 = input1;
	   this.mInput2 = input2;
	   this.mExpected = expected;
   }

   @Test
   public void testGetDiscount() throws Exception {
 	  // TODO: Write Your Answer
      // Assert.assertEquals(mExpected, TODO: Write Your Answer);
	   int actualResult = com.getDiscount(mInput1, mInput2);
	   Assert.assertEquals(mExpected, actualResult);
   }
}
