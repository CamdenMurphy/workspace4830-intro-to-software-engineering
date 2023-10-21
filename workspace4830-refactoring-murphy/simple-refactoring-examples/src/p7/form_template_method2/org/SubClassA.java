package p7.form_template_method2.org;

public class SubClassA {

   public double compute(double unit, double rate) {
      double base = unit * rate;
      double tax = base * SuperClass.TAX_RATE;
      return base + tax;
   }
}
