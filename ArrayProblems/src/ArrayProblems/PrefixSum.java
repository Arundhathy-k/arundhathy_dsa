package ArrayProblems;

import java.util.Scanner;

public class PrefixSum {
	
	 public static int[] fillPrefixSum(int[] arr,int n,int[] prefixSum){
	        prefixSum[0]=arr[0];
	        for(int i=1;i<=n-1;i++){
	         prefixSum[i] = prefixSum[i-1] + arr[i];
	        
	        }
	        return prefixSum;
	    }
	    
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        int n = scanner.nextInt();

	        int arr[] = new int[n];
	        int prefixSum[] = new int[n];

	        for (int i = 0; i < n; i++) {
	            arr[i] = scanner.nextInt();
	        
	        }        
	        // Function call
	        fillPrefixSum(arr, n, prefixSum);
	        for (int i = 0; i < n; i++)
	            System.out.print(prefixSum[i] + " ");
	        System.out.println();
	        scanner.close();
	    }
	}

