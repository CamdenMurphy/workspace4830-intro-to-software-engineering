package p1.extract_superclass.refactored;

public class Employee extends Party {
   private int id;

   @Override
   int getAnnualCost() {
      return this.annualCost;
   }

   int getId() {
      return this.id;
   }
}
