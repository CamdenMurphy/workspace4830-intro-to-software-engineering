package p5.extract_method_typeparameterize.org;

import java.util.List;

public class A {
   Node m1(List<Node> nodes, String p) {
      for (Node node : nodes) { // similar part
         if (node.contains(p))
            System.out.println(node);
      }
      // other implementations
      return null;
   }

   Edge m2(List<Edge> edges, String p) {
      for (Edge edge : edges) { // similar part
         if (edge.contains(p))
            System.out.println(edge);
      }
      // other implementations
      return null;
   }
}

class Node {
   String name;

   public boolean contains(String p) {
      return name.contains(p);
   }
}

class Edge {
   String name;

   public boolean contains(String p) {
      return name.contains(p);
   }
}