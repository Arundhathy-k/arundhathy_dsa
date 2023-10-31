package ArrayProblems;

import java.util.Scanner;

public class TranseposeOfMatrix {

	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
	    int[][] mat = new int[n][n];
	    for (int i = 0; i < n; i++)
	      for (int j = 0; j < n; j++)
	        mat[i][j] = in.nextInt();

	    transpose(mat);
	    for (int i = 0; i < n; i++){
	      for (int j = 0; j < n; j++)
	        System.out.print(mat[i][j] + " ");
	        System.out.println();
	    }
	    in.close();

	  }
	  public static void transpose(int[][] mat){
	    for(int i=0;i<mat.length;i++){
	      for(int j=i+1;j<mat[0].length;j++){
	        int temp=mat[i][j];
	        mat[i][j]=mat[j][i];
	        mat[j][i]=temp;
	      }
	    }


	}

}
