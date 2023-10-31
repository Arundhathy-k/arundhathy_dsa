package ArrayProblems;

public	class SparseMatrix {
	public static void main(String[] args) { 
		// Creating a sparse matrix 
		int sparseMatrix[][] 
				= { 
						{0, 0, 3, 0, 4}, 
						{0, 0, 5, 7, 0}, 
						{0, 0, 0, 0, 0}, 
						{0, 2, 6, 0, 0} 
		}; 

		// Calculates number of rows and columns present in given matrix     
		int rows = sparseMatrix.length;     
		int cols = sparseMatrix[0].length;  

		int count = 0; 
		System.out.println("Original Matrix..."); 
		for (int i = 0; i < rows; i++) { 
			for (int j = 0; j < cols; j++) { 
				System.out.print(sparseMatrix[i][j]+" ");
				if (sparseMatrix[i][j] != 0) {
                    count++; 
                }

			}
			System.out.println();
		}
		// Corresponding row, column, and the non-zero value are stored in compactMatrix 
		// Number of columns in compactMatrix (count) must be equal to number of  
		// non - zero elements in sparseMatrix 
		int compactMatrix[][] = new int[3][count]; 
		// Making of new matrix 
		int k = 0; 
		for (int i = 0; i < rows; i++) { 
			for (int j = 0; j < cols; j++) { 
				if (sparseMatrix[i][j] != 0) {
					compactMatrix[0][k] = i; 
					compactMatrix[1][k] = j; 
					compactMatrix[2][k] = sparseMatrix[i][j]; 
					k++; 
				} 
			} 
		} 

		System.out.println("\nRows, columns, and the corresponding non-zero values are:"); 
		for (int i = 0; i < 3; i++) { 
			for (int j = 0; j < count; j++) { 
				System.out.print(compactMatrix[i][j]+" "); 
			} 
			System.out.println(); 
		} 

	} 

}                	
