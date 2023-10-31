package ArrayProblems;

import java.util.Arrays;
import java.util.Scanner;

public class KthLargest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size:");
		int n = sc.nextInt();
		System.out.println("Enter the k value:");
		int k = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elements: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
Arrays.sort(arr);
 for(int i=0;i<=n;i++) {
	 if(i==n-k) {
	 System.out.println(arr[i]+" ");
	 break;
	 }
 }
 sc.close();
	}

}
