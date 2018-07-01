package BFS_DFS;		

import java.util.*;
import java.io.*;

class Graph{
	class Node{
		int data;
		LinkedList<Node> adjacent;
		boolean marked;
		Node(int data){
			this.data = data;
			this.marked = false;
			adjacent = new LinkedList<Node>();
		}
	}
	Node[] nodes;
	Graph(int size){
		nodes = new Node[size];
		for(int i=0; i<size; i++){
			nodes[i] = new Node(i);
		}
	}
	
	// 양방향그래프
	void addEdge(int i, int j){
		Node n1 = nodes[i];
		Node n2 = nodes[j];
		if (!n1.adjacent.contains(n2)){
			n1.adjacent.add(n2);
		}
		if (!n2.adjacent.contains(n1)){
			n2.adjacent.add(n1);
		}
	}
	void dfs(int index){
		Node root = nodes[index];
		Stack<Node> stk = new Stack<>();
		stk.push(root);
		root.marked = true;
		while (!stk.isEmpty()){
			Node ns = stk.pop();
			System.out.print(ns.data+" ");
			for(Node n: ns.adjacent){
				if(n.marked == false){
					n.marked = true;
					stk.push(n);
				}
			}
		}
	}
	
	
	void bfs(int index){
		Node root = nodes[index];
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		root.marked = true;
		while (!q.isEmpty()){
			Node ns = q.remove();
			System.out.print(ns.data+" ");
			for(Node n:ns.adjacent){
				if(n.marked == false){
					n.marked = true;
					q.add(n);
				}
			}
		}
	}
	
	
	void dfsR(Node ns){
		if(ns == null) 
			return;
		ns.marked = true;
		System.out.print(ns.data+" ");
		for(Node n: ns.adjacent){
			if(n.marked == false){
				dfsR(n);
			}
		}
	}
	void dfsR(int index){
		Node ns = nodes[index];
		dfsR(ns);
	}	
}
public class Main {
	public static void main(String []args){
		Graph g = new Graph(9);
		g.addEdge(0, 1);
		g.addEdge(1, 2);
		g.addEdge(1, 3);
		g.addEdge(2, 4);
		g.addEdge(2, 3);
		g.addEdge(3, 4);
		g.addEdge(3, 5);
		g.addEdge(5, 6);
		g.addEdge(5, 7);
		g.addEdge(6, 8);
//		g.dfs(0);
//		g.bfs(0);
		g.dfsR(0);
		
	}
}
