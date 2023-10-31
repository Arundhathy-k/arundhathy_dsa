package com.gl;

import java.util.Iterator;
import java.util.LinkedList;

public class BFS {

		private LinkedList<Integer> adjList[];
		private boolean visited[];
		
		BFS(int data){
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
		void performBfs(int StartingVertex) {
			visited[StartingVertex] = true;
			
			LinkedList<Integer> queue = new LinkedList<>();
			queue.add(StartingVertex);
			
			while(queue.size()!=0) {
				int newVertex = queue.poll();
				System.out.print(newVertex+" ");
				
				Iterator<Integer> iterator = adjList[newVertex].listIterator();
				while(iterator.hasNext()) {
					int n = iterator.next();
					if(!visited[n]) {
						visited[n]=true;
						queue.add(n);
					}
				}
			}
		}

		public static void main(String[] args) {
	
			BFS bfs = new BFS(4);
			
			bfs.addEdge(0, 1);
			bfs.addEdge(1, 2);
			bfs.addEdge(2, 0);
			bfs.addEdge(3, 1);
			bfs.addEdge(3, 0);
			bfs.addEdge(3, 2);
			
			bfs.printGraph(4);
			System.out.println();
	        bfs.performBfs(1);
}
}