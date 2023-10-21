package q2.form_template_method1.org;

public class A {
   public static void main(String[] args) {
      System.out.println("Before");
      System.out.println("m1:" + (new A().m1(0, 3)));
      System.out.println("m2:" + (new A().m2(0, 3)));
   }

   int m1(int min, int max) {
      int sum = 0;
      for (int i = min; i <= max; i++) {
         sum += i;
      }
      return sum;
   }

   int m2(int min, int max) {
      int sum = 0;
      for (int i = min; i <= max; i++) {
         sum += i * i;
      }
      return sum;
   }
}
