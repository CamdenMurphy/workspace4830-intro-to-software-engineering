public aspect TraceAspectMurphy {
   pointcut classToTrace(): within(*App);
   pointcut methodToTrace():  classToTrace() &&  execution(String getName());

   before(): methodToTrace() {
      String info = "[BGN] " + thisJoinPointStaticPart.getSignature() + ", " //
            + thisJoinPointStaticPart.getSourceLocation().getLine();
      System.out.println(info);
   }

   after(): methodToTrace() {
      System.out.println("[END] " + thisJoinPointStaticPart.getSourceLocation().getFileName());
   }
}