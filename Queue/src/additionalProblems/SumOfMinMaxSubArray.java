package additionalProblems;

import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.Deque;

public class SumOfMinMaxSubArray {
	/*
	 * compute the sum of minimum and maximum elements of all sub-array of size k.
	 * Sample Input: 7
	 *  4 5 -1 9 -3 -1 -4 
	 *  3
	 *   Sample output: 19 Explanation: {4,5,-1} =
	 * min+max= -1+5=4 {5,-1,9}=min+max= -1+9=8 {-1,9,-3}=min+max=-3+9=6 {9,-3,-1}
	 * =min+max=-3+9=6 {-3,-1,-4} min+max=-4-1=-5 So the final answer 4+8+6+6-5=19
	 */
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the size : ");
	    int n = sc.nextInt();
	    int [] arr = new int[n];
	    System.out.println("Enter the elements:");
	    for(int i=0;i<n;i++){
	    arr[i] = sc.nextInt();
	    }
	    System.out.println("Enter the k value:");
	    int k = sc.nextInt();
	     System.out.println(minMaxSum(n,arr,k));
	     sc.close();
	     }

	     public static int minMaxSum(int n,int[] arr,int k){
	     Deque <Integer>  maxDeque = new ArrayDeque<>();
	     Deque <Integer> minDeque = new ArrayDeque<>();
	     int sum = 0;

	      for (int i = 0; i < arr.length; i++) {
	            // Remove elements that are out of the current window
	            while (!maxDeque.isEmpty() && maxDeque.peekFirst() < i - k + 1) {
	                maxDeque.pollFirst();
	            }
	            while (!minDeque.isEmpty() && minDeque.peekFirst() < i - k + 1) {
	                minDeque.pollFirst();
	            }
	            
	            // Remove elements that are smaller than the current element
	            while (!maxDeque.isEmpty() && arr[maxDeque.peekLast()] < arr[i]) {
	                maxDeque.pollLast();
	            }
	            while (!minDeque.isEmpty() && arr[minDeque.peekLast()] > arr[i]) {
	                minDeque.pollLast();
	            }
	            
	            // Add the current element to the Deques
	            maxDeque.offerLast(i);
	            minDeque.offerLast(i);
	            
	            // Compute and update the sum when the window is of size k
	            if (i >= k - 1) {
	                sum += arr[maxDeque.peekFirst()] + arr[minDeque.peekFirst()];
	            }
	        }
	        
	        return sum;
	    

	     }

}
