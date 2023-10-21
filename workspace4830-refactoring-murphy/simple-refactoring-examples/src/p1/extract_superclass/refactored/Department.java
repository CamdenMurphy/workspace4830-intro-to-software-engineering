package p1.extract_superclass.refactored;

public class Department extends Party {
   private int headCount;

   @Override
   int getAnnualCost() {
      return this.annualCost;
   }

   int getHeadCount() {
      return this.headCount;
   }
}
