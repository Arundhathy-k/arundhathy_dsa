package com.gl;

public class AdjacencyMatrix {
    
	private boolean adjMatrix[][];
	private int NumOfVertices;
	
	public AdjacencyMatrix(int size) {
		NumOfVertices = size;
		adjMatrix = new boolean[size][size];
	}
	
	public void addEdge(int i,int j) {
		if(i>=0 && i<NumOfVertices && j>=0 && j<NumOfVertices) {
		adjMatrix[i][j] = true;
		adjMatrix[j][i] = true;
	}
	}
	public void removeEdge(int i,int j) {
		if(i>=0 && i<NumOfVertices && j>=0 && j<NumOfVertices) {
		adjMatrix[i][j] = false;
		adjMatrix[j][i] = false;
	}
	}
	public boolean isEdge(int i,int j) {
		if(adjMatrix[i][j]==true) 
		      return true;
       return false;
  
	}
	   	public void printMatrix() {
		for(int i=0;i<NumOfVertices;i++) {
			for(int j=0;j<NumOfVertices;j++){
				if(adjMatrix[i][j]==true) {
			System.out.print(1+" ");	
			}
				else
					System.out.print(0+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		AdjacencyMatrix adjMat = new AdjacencyMatrix(4);
		adjMat.addEdge(0, 2);
		adjMat.addEdge(1, 2);
		adjMat.addEdge(2, 3);
		adjMat.addEdge(3, 1);
		adjMat.printMatrix();
		System.out.println();
		adjMat.removeEdge(3, 1);
		adjMat.printMatrix();
	}

}
