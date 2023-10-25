package p3.csvfilesource;

import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class TestMySum {
   /*
    * Another way to specify the source of arguments for parameterized tests is 
    * using comma-separated values (CSV).
    */

   @ParameterizedTest//(name = "{index} => input1={0}, input2= {1}, result={2}")
   @CsvFileSource(resources = "sum_test_dataset.csv")
   void testSum(int input1, int input2, int expected) {
      MySum mySum = new MySum(input1, input2);
      int result = mySum.sum();
      Assert.assertEquals(expected, result);
   }
}
