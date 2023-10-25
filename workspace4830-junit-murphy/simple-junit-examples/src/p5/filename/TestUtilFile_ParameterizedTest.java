package p5.filename;

import java.io.File;

import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class TestUtilFile_ParameterizedTest {
   String S = File.separator;

   @ParameterizedTest
   @CsvFileSource(resources = "utilfile_dataset.csv")
   public void testGetShortFileName(String input, String expected) {
      String actualResult = UtilFile.getShortFileName(input);
      System.out.println("[DBG] Actual Result: " + actualResult);
      Assert.assertEquals(expected, actualResult);
   }
}
