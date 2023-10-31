package additional_problems;

import java.util.Scanner;
import java.util.Stack;

public class PairwiseRemoving {
	
	/* Removing continues duplicate elements.
	 * Input
	 * 5
	 * 10 20 20 50 10
	 * Output
	 * 3
	 */
	public static void main(String[] args) {

	       Scanner scanner = new Scanner(System.in);
	       System.out.println("Enter the size:");
	        int n = scanner.nextInt();
	        int[] arr = new int[n];
	        System.out.println("Enter the elements: ");
	        for (int i = 0; i < n; i++) {
	            arr[i] = scanner.nextInt();
	        }

	        int result = remainingElementsAfterPairwiseDestruction(arr);
	        System.out.println(result);
	        scanner.close();
	    }

	    public static int remainingElementsAfterPairwiseDestruction(int[] arr) {
	        Stack<Integer> stack = new Stack<>();

	        for (int num : arr) {
	            if (!stack.isEmpty() && stack.peek() == num) {
	                stack.pop(); // Destroy the pair by removing the top element from the stack.
	            } else {
	                stack.push(num);
	            }
	        }

	        return stack.size();
	    }
}
