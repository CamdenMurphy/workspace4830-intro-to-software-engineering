package p1.extract_superclass.org;

public class Department {
   private int headCount;
   private int annualCost;
   private String name;

   int getTotalAnnualCost() {
      return this.annualCost;
   }

   String getName() {
      return this.name;
   }

   int getHeadCount() {
      return this.headCount;
   }
}
