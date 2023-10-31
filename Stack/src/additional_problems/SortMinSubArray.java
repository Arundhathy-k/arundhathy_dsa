package additional_problems;

import java.util.Scanner;
import java.util.Stack;

public class SortMinSubArray {
	/*
	 * You are given an integer array nums of size n. You have to find one
	 * continuous subarray. If you sort this subarray the whole array will be sorted
	 * in increasing order. Find the minimum length of such subarray.
	 *  Sample input:
	 * 7 
	 * 1 6 4 12 10 8 17 
	 * Sample output: 5
	 */
	
	public static void main(String[] args) {
	     Scanner sc = new Scanner(System.in);
	     System.out.println("Enter the size:");
	     int n = sc.nextInt();
	     int [] nums = new int[n];
	     System.out.println("Enter the elements: ");
	     for(int i=0;i<n;i++){
	      nums[i]=sc.nextInt();
	     } 
	      int result = findMinimumUnsortedSubarrayLength(nums);
	        System.out.println(result);
	        sc.close();
	    }

	    public static int findMinimumUnsortedSubarrayLength(int[] nums) {
	        int n = nums.length;

	        // Create a stack to store the indices of elements in a non-decreasing order.
	        Stack<Integer> stack = new Stack<>();
	        int left = n;
	        int right = 0;

	        // Find the left boundary of the unsorted subarray.
	        for (int i = 0; i < n; i++) {
	            while (!stack.isEmpty() && nums[i] < nums[stack.peek()]) {
	                left = Math.min(left, stack.pop());
	            }
	            stack.push(i);
	        }

	        stack.clear();

	        // Find the right boundary of the unsorted subarray.
	        for (int i = n - 1; i >= 0; i--) {
	            while (!stack.isEmpty() && nums[i] > nums[stack.peek()]) {
	                right = Math.max(right, stack.pop());
	            }
	            stack.push(i);
	        }

	        // Calculate the length of the unsorted subarray.
	        int length = right - left + 1;

	        // If the entire array is sorted, return 0. Otherwise, return the length of the subarray.
	        return length == n ? 0 : length;
	    }
}
