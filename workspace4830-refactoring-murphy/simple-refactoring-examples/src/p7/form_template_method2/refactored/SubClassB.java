package p7.form_template_method2.refactored;

public class SubClassB extends SuperClass {

   @Override
   double computeBase(double unit, double rate) {
      return unit * rate * 0.5;
   }

   @Override
   double computeTax(double base) {
      return base * SuperClass.TAX_RATE * 0.2;
   }
}
