package p7.form_template_method2.refactored;

public class SubClassA extends SuperClass {
   @Override
   double computeBase(double unit, double rate) {
      return unit * rate;
   }

   @Override
   double computeTax(double base) {
      return base * SuperClass.TAX_RATE;
   }
}
