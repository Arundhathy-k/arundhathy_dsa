package ArrayProblems;

import java.util.Scanner;

public class SuffixSum {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size:");
        int N = scanner.nextInt();

        int[] arr = new int[N];
        System.out.println("Enter the elements:");
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        int[] suffixSum = createSuffixSum(arr, N);

        for (int i = 0; i < N; i++)
            System.out.print(suffixSum[i] + " ");
        scanner.close();
            
	}

	private static int[] createSuffixSum(int[] arr, int n) {
	     int[] arr1 = new int[n];
	      arr1[n-1]= arr[n-1];
	      for(int i=n-2;i>=0;i--)
	      arr1[i]=arr1[i+1]+arr[i];
	      return arr1;
		
	}

}
