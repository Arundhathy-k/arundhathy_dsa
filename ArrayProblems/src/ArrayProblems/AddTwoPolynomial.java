package ArrayProblems;

import java.util.Scanner;

public class AddTwoPolynomial {
    
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the degree of the first polynomial: ");
	        int degree1 = scanner.nextInt();

	        System.out.print("Enter the degree of the second polynomial: ");
	        int degree2 = scanner.nextInt();

	        int[] polynomial1 = new int[degree1 + 1];
	        int[] polynomial2 = new int[degree2 + 1];

	        System.out.println("Enter coefficients of the first polynomial:");
	        for (int i = 0; i <= degree1; i++) {
	            System.out.print("Coefficient for x^" + i + ": ");
	            polynomial1[i] = scanner.nextInt();
	        }

	        System.out.println("Enter coefficients of the second polynomial:");
	        for (int i = 0; i <= degree2; i++) {
	            System.out.print("Coefficient for x^" + i + ": ");
	            polynomial2[i] = scanner.nextInt();
	        }

	        int[] result = addPolynomials(polynomial1, polynomial2);

	        System.out.print("Result of addition: ");
	        for (int i = 0; i < result.length; i++) {
	            if (i < result.length - 1 ) {
	                System.out.print(result[i] + "x^" + i + " + ");
	            } else {
	                System.out.print(result[i]);
	            }
	        }

	        scanner.close();
	    }

	    public static int[] addPolynomials(int[] poly1, int[] poly2) {
	        int degree1 = poly1.length;
	        int degree2 = poly2.length;
	        int maxDegree = Math.max(degree1, degree2);

	        int[] result = new int[maxDegree];

	        for (int i = 0; i < maxDegree; i++) {
	            int coef1 = (i < degree1) ? poly1[i] : 0;
	            int coef2 = (i < degree2) ? poly2[i] : 0;
	            result[i] = coef1 + coef2;
	        }

	        return result;
	    }
	}

