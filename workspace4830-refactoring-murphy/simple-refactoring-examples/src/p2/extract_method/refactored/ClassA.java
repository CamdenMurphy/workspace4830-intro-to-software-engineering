package p2.extract_method.refactored;

public class ClassA extends Base {
   void method1(byte[] buf, int sz) {
      send(buf, sz);
   }

   void method2(int[] cnt, byte[] data, int len) {
      for (int i = 0; i < cnt.length; i++) {
         if (cnt[i] % 100 == 0) {
            send(data, len);
         }
      }
   }

   private void send(byte[] data, int len) {
      for (int j = 0; j < len; j++) {
         send(data[j]);
      }
   }
}

class Base {
   void send(Byte b) {
      // send b to a server.
   }
}