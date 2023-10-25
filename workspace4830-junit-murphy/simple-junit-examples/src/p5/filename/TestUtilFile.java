package p5.filename;

import java.io.File;

import org.junit.Assert;
import org.junit.Test;

public class TestUtilFile {
   String S = File.separator;

   @Test
   public void testGetShortFileName() {
      String input = S + "user" + S + "file.java";
      String expected = "file";
      String actualResult = UtilFile.getShortFileName(input);
      Assert.assertEquals(expected, actualResult);
   }
}
