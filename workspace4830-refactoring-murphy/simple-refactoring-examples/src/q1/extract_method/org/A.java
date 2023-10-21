package q1.extract_method.org;

import java.util.List;

public class A {
	Node m1(List<Node> nodes, String p) {
		for (Node node : nodes) {
			if (node.contains(p))
				System.out.println(node);
		}
		// other implementation
		return null;
	}

	Edge m2(List<Edge> edgeList, String p) {
		for (Edge edge : edgeList) {
			if (edge.contains(p))
				System.out.println(edge);
		}
		// other implementation
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