package p5.filename;

import java.io.File;

public class UtilFile {
   final static String S = File.separator;

   public static String getShortFileName(String path) {
      int index1 = path.lastIndexOf(S);
      int index2 = path.lastIndexOf(".");
      String result = path.substring(index1 + 1, index2);
      return result;
   }
}
