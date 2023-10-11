package pkg3;

public aspect TraceAspect {
   pointcut classToTrace(): within(TwoDShape) || within(Circle) || within(Square);

   pointcut constructorToTrace(): classToTrace() && execution(new(..));

   pointcut methodToTrace():  classToTrace() &&  execution(* *(..));

   before(): constructorToTrace() {
      System.out.println("\t-->" + thisJoinPointStaticPart.getSignature() + //
            ", kind: " + thisJoinPointStaticPart.getKind());
      Object[] paramValues = thisJoinPoint.getArgs();
      if (paramValues != null) {
         for (Object iParam : paramValues) {
            System.out.println("\t\tPARAM: " + iParam);
         }
      }
   }

   after(): constructorToTrace() {
      System.out.println("\t<--" + thisJoinPointStaticPart.getSignature());
   }

   before(): methodToTrace() {
      System.out.println("\t-->" + thisJoinPointStaticPart.getSignature() + //
            ", kind: " + thisJoinPointStaticPart.getKind() + //
            ", loc: " + thisJoinPointStaticPart.getSourceLocation().getFileName() + ", " + //
            thisJoinPointStaticPart.getSourceLocation().getWithinType() + ", " + //
            thisJoinPointStaticPart.getSourceLocation().getLine());
   }

   after(): methodToTrace() {
      System.out.println("\t<--" + thisJoinPointStaticPart.getSignature());
   }
}
