package p7.form_template_method2.refactored;

public abstract class SuperClass {
   public static final double TAX_RATE = 3;

   public double compute(double i, double j) {
      double base = computeBase(i, j);
      double tax = computeTax(base);
      return base + tax;
   }

   abstract double computeBase(double i, double j);

   abstract double computeTax(double base);
}
