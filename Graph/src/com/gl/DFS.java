package com.gl;

import java.util.Iterator;
import java.util.LinkedList;

public class DFS {
	private LinkedList<Integer> adjList[];
	private boolean visited[];
	
	DFS(int data){
		adjList = new LinkedList[data];
		visited = new boolean[data];
		
		for(int i=0;i<data;i++) {
			adjList[i] = new LinkedList<Integer>();
		}
	}
	
	void addEdge(int i,int j) {
		adjList[i].add(j);
		adjList[j].add(i);
	}
	
	void printGraph(int vertices) {
		for(int i=0;i<vertices;i++) {
			System.out.print(adjList[i]+" ");
		}
	}
	void performDfs(int startingVertex) {
		visited[startingVertex] =true;
		System.out.print(startingVertex+" ");
		Iterator<Integer> iterator = adjList[startingVertex].listIterator();
		while(iterator.hasNext()) {
			int newVertex = iterator.next();
			if(!visited[newVertex]) {
				performDfs(newVertex);
			}
		}
	}
	public static void main(String[] args) {
		DFS dfs = new DFS(4);
		
		dfs.addEdge(0, 1);
		dfs.addEdge(1, 2);
		dfs.addEdge(2, 0);
		dfs.addEdge(3, 1);
		dfs.addEdge(3, 0);
		dfs.addEdge(3, 2);
		
		dfs.printGraph(4);
		System.out.println();
        dfs.performDfs(1);
		

	}

}
