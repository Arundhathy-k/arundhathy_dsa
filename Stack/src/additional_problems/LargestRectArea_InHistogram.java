package additional_problems;

import java.util.Scanner;
import java.util.Stack;
  
public class LargestRectArea_InHistogram{
	
	public static int largestRectangleArea(int[] heights) {
		int n = heights.length;
		Stack<Integer> stack = new Stack<>();
		int maxArea = 0;

		for (int i = 0; i <= n; i++) {
			while (!stack.isEmpty() && (i == n || heights[stack.peek()] > heights[i])) {
				int maxheight = heights[stack.pop()];
				int width = stack.isEmpty() ? i : i - stack.peek() - 1;
				maxArea = Math.max(maxArea, maxheight * width);
			}
			stack.push(i);
		}

		return maxArea;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number of histogram bars: ");
		int n = scanner.nextInt();

		int[] histogram = new int[n];
		System.out.println("Enter the heights of the histogram bars:");

		for (int i = 0; i < n; i++) {
			histogram[i] = scanner.nextInt();
		}

		int result = largestRectangleArea(histogram);
		System.out.println("The largest rectangle area is: " + result);
		scanner.close();
	}
}
