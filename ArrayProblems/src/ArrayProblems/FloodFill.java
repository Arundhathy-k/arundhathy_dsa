package ArrayProblems;

import java.util.Scanner;

public class FloodFill {
	public static void main(String[] args) {
		/*
		 * input: 3 3 
		 * 1 1 1
		 * 1 1 0
		 * 1 0 1
		 * 
		 * 1 1 2 sr,sc,newcol
		 *  output: 
		 *  2 2 2
		 *  2 2 0
		 *  2 0 1
		 */	   
		Scanner in = new Scanner(System.in);
	      System.out.println("Enter the row: " );
	      int row = in.nextInt();
	      System.out.println("Enter the col:");
	      int col = in.nextInt();
	      System.out.println("Enter the elements: ");
	      int[][] mat=new int[row][col];
	      for(int i=0;i<row;i++){
	        for(int j=0;j<col;j++){
	            mat[i][j]=in.nextInt();
	        }
	      }
	      System.out.println("Enter the sr: ");
	      int sr= in.nextInt();
	      System.out.println("Enter the sc:");
	      int sc= in.nextInt();
	      System.out.println("Enter the newCol:");
	      int newCol=in.nextInt();
	      floodFill(mat,sr,sc,newCol);
	      for(int i=0;i<row;i++){
	        for(int j=0;j<col;j++){
	         System.out.print(mat[i][j]+ " ");
	        }
	    }
	      in.close();
	    }
	     public static int[][] floodFill(int[][] mat,int sr,int sc,int newCol){
	       int orgCol=mat[sr][sc];
	       if(newCol==orgCol){
	         return mat;
	         }
	         color(mat,sr,sc,newCol,orgCol);
	         return mat;
	     }

	    
	    public static void color(int[][] mat,int sr,int sc,int newCol,int orgCol){
	      if(sr<0 || sr>=mat.length || sc<0 || sc>=mat.length ||
	      mat[sr][sc]==0 || mat[sr][sc]==newCol)
	       return;  

	    mat[sr][sc]=newCol;

	    color(mat,sr-1,sc,newCol,orgCol);
	    color(mat,sr+1,sc,newCol,orgCol);
	    color(mat,sr,sc-1,newCol,orgCol);
	    color(mat,sr,sc+1,newCol,orgCol);  
	}
}
