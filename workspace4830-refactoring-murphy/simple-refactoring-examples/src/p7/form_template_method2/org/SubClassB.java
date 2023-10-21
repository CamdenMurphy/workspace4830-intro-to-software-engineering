package p7.form_template_method2.org;

public class SubClassB {

   public double compute(double unit, double rate) {
      double base = unit * rate * 0.5;
      double tax = base * SuperClass.TAX_RATE * 0.2;
      return base + tax;
   }
}
