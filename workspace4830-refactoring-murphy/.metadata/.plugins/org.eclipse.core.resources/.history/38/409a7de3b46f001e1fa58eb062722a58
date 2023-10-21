package p5.extract_method_typeparameterize.refactored;

import java.util.List;

public class A {
   Node m1(List<Node> nodes, String p) {
      extractedMethod(nodes, p);
      // other implementations
      return null;
   }

   Edge m2(List<Edge> edges, String p) {
      extractedMethod(edges, p);
      // other implementations
      return null;
   }

   /**
    * Extract Method Refactoring by Type Parameterizing
    */
   <T extends Graph> void extractedMethod(List<T> objs, String p) {
      for (T obj : objs) {
         if (obj.contains(p))
            System.out.println(obj);
      }
   }
}

/**
 * Extract Superclass Refactoring
 */
class Graph {
   String name;

   public boolean contains(String p) {
      return name.contains(p);
   }

}

class Node extends Graph {
}

class Edge extends Graph {
}