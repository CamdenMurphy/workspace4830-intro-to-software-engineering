package p4.csvfilesource;

import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class TestCustomer_Parameterized {
   @ParameterizedTest
   @CsvFileSource(resources = "customer_value_dataset.csv")
   void testGetValue(int input1, int input2, int expected) {
      Customer customer = new Customer();
      int actualResult = customer.getValue(input1, input2);
      Assert.assertEquals(expected, actualResult);
   }
}