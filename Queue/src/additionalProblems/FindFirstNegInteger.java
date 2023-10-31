package additionalProblems;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class FindFirstNegInteger {
	/*
	 * find the first negative integer for each window(contiguous subarray) of size
	 * k. If a window does not contain a negative integer, then print 0 for that
	 * window. Sample Input: 6 -4 -3 1 2 7 -6 3 Sample output -4 -3 0 -6
	 */
	 public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter the size:");
	      int n = sc.nextInt();
	      int [] arr = new int[n];
	      System.out.println("Enter the elements:");
	      for(int i=0;i<n;i++){
	      arr[i] = sc.nextInt();
	    }
	      System.out.println("Enter the k value: ");
	      int k = sc.nextInt();
	      int[] result = findFirstNegativeInWindow(arr,n, k);
	        for (int num : result) {
	            System.out.print(num + " ");
	        }
	        sc.close();
	    } 
	     public static int[] findFirstNegativeInWindow(int[] arr,int n,int k){
	     Deque <Integer> negDeque = new ArrayDeque<>();
	       int[] result = new int[n-k+1];
	        int  resultIndex = 0;
	             for (int i = 0; i < n; i++) {
	            // Remove elements that are out of the current window
	            while (!negDeque.isEmpty() && negDeque.peekFirst() < i - k + 1) {
	                negDeque.pollFirst();
	            }

	            // Add the negative integer to the Deque
	            if (arr[i] < 0) {
	                negDeque.offerLast(i);
	            }

	            // Check if the first element in the window is a negative integer
	            if (i >= k - 1) {
	                if (!negDeque.isEmpty() && negDeque.peekFirst() >= i - k + 1) {
	                    result[resultIndex++] = arr[negDeque.peekFirst()];
	                } else {
	                    result[resultIndex++] = 0;
	                }
	            }
	        }

	        return result;
	    }
}
