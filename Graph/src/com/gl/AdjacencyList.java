package com.gl;

import java.util.ArrayList;

public class AdjacencyList {
	
	int NumOfVertices;
	ArrayList<ArrayList<Integer>> arrayList = new ArrayList<ArrayList<Integer>>();
	public AdjacencyList(int data) {
		NumOfVertices = data;

	for(int i=0;i<NumOfVertices;i++) {
		arrayList.add(new ArrayList<Integer>());
	}
}	
   public void addEdge(int i,int j) {
	   arrayList.get(i).add(j);
	   arrayList.get(j).add(i);
   }
   public void removeEdge(int i,int j) {
	   int value = arrayList.get(i).indexOf(j);
	   arrayList.get(i).remove(value);
	   
	   value = arrayList.get(j).indexOf(i);
	   arrayList.get(j).remove(value);
	   
   }
	public  void printList() {
		System.out.println();
		System.out.println(arrayList);
 	}	
	public static void main(String[] args) {
		AdjacencyList adjList = new AdjacencyList(4);
		adjList.addEdge(0, 3);
		adjList.addEdge(1, 2);
		adjList.addEdge(2, 3);
		adjList.printList();
		adjList.removeEdge(2, 1);
		adjList.printList();
	}
}
