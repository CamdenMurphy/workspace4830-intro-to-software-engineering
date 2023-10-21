package q2.form_template_method1.refactored;

public class A {
   public static void main(String[] args) {
      System.out.println("After");
      System.out.println("m1:" + (new A().m1(0, 3)));
      System.out.println("m2:" + (new A().m2(0, 3)));
   }

   int m1(int min, int max) {
      return new M1().common(min, max);
   }

   int m2(int min, int max) {
      return new M2().common(min, max);
   }
}

abstract class Template {
   int common(int min, int max) {
      int sum = 0;
      // TODO: Replace the FOR statement below with your answer.
      for (int i = min; i <= max; i++) {
    	  sum += apply(i);
      }
      return sum;
   }

   abstract int apply(int i);
}

class M1 extends Template {

   @Override
   int apply(int i) {
      // TODO: Replace the statement below with your answer.
      return i;
   }
}

class M2 extends Template {

   @Override
   int apply(int i) {
      // TODO: Replace the statement below with your answer.
      return i * i;
   }
}
