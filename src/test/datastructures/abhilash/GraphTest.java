package test.datastructures.abhilash;

import com.datastructures.abhilash.Graph;
import com.datastructures.abhilash.Graph.Node;

public class GraphTest {
	public static void main(String[] args) {
		Graph graph=new Graph();
		Node one=new Node(1);
		graph.nodeLookUp.put(1, one);
		Node twenty=new Node(20);
		graph.nodeLookUp.put(20, twenty);
		graph.addEdge(1, 20);
		Node three=new Node(3);
		graph.nodeLookUp.put(3, three);
		graph.addEdge(1,3);
		Node five=new Node(5);
		graph.nodeLookUp.put(5, five);
		graph.addEdge(20,5);
		graph.addEdge(3, 5);
		Node six=new Node(6);
		graph.nodeLookUp.put(6,six);
		graph.addEdge(5, 6);
		graph.addEdge(3, 6);
		Node seven=new Node(7);
		graph.nodeLookUp.put(7, seven);
		System.out.println(graph.hasPathDFS(1, 7));
		System.out.println(graph.hasPathBFS(1, 7));
		
	}
}
