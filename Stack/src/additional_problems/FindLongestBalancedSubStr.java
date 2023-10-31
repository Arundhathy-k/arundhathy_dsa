package additional_problems;

import java.util.Scanner;
import java.util.Stack;

public class FindLongestBalancedSubStr {

	// sample input: [][[]]]]]
	// output: 6

	public static int findLongestValidSubstring(String s) {
		Stack<Integer> stack = new Stack<>();
		stack.push(-1); // Initialize the stack with -1 as a base index
		int maxLen = 0;

		for (int i = 0; i < s.length(); i++) {
			char currentChar = s.charAt(i);

			if (currentChar == '[') {
				stack.push(i); // Push the current index onto the stack
			} else if (currentChar == ']') {
				stack.pop(); // Pop the top index from the stack

				if (!stack.isEmpty()) {
					// If the stack is not empty, calculate the length of the balanced substring
					int balancedStartIndex = stack.peek();
					maxLen = Math.max(maxLen, i - balancedStartIndex);
				} else {
					stack.push(i); // Push the current index onto the stack as a new base
				}
			}
		}

		return maxLen;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s = sc.nextLine();
		int longestValidSubstringLength = findLongestValidSubstring(s);
		System.out.println(longestValidSubstringLength);
		sc.close();
	}
}
