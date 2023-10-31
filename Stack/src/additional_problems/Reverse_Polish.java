package additional_problems;

import java.util.Scanner;
import java.util.Stack;

public class Reverse_Polish {

	public int evalExpression(String[] arr) {
		Stack<Integer> stack = new Stack<>();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals("+")) {
				int operand2 = stack.pop();
				int operand1 = stack.pop();
				stack.push(operand1 + operand2);
			} else if (arr[i].equals("*")) {
				int operand2 = stack.pop();
				int operand1 = stack.pop();
				stack.push(operand1 * operand2);
			} else if (arr[i].equals("-")) {
				int operand2 = stack.pop();
				int operand1 = stack.pop();
				stack.push(operand1 - operand2);
			} else if (arr[i].equals("/")) {
				int operand2 = stack.pop();
				int operand1 = stack.pop();
				stack.push(operand1 / operand2);
			} else {
				stack.push(Integer.parseInt(arr[i]));
			}
		}
		return stack.pop();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Reverse_Polish obj = new Reverse_Polish();
		System.out.println("Enter the string: ");
		String []arr = new String[100];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextLine();
		}
		System.out.println(obj.evalExpression(arr));
		sc.close();
	}
}
