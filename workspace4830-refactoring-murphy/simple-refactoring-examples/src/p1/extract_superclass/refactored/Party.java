package p1.extract_superclass.refactored;

public class Party {
   private String name;
   protected int annualCost;

   int getAnnualCost() {
      return this.annualCost;
   }

   String getName() {
      return this.name;
   }
}