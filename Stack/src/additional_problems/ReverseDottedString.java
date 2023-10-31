package additional_problems;

import java.util.Scanner;
import java.util.Stack;

public class ReverseDottedString {
	
	// sample input:i.am.good.coder
	// output: i.ma.doog.redoc
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
             String s = sc.nextLine();
        String[] words = s.split("\\."); // Split the input string into words

        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            for (char c : word.toCharArray()) {
                stack.push(c); // Push characters of the word onto the stack
            }

            while (!stack.isEmpty()) {
                result.append(stack.pop()); // Pop characters to reverse the word
            }

            if (i < words.length - 1) {
                result.append('.'); // Append a dot after each word except the last one
            }
        }

        System.out.println(result.toString());
        sc.close();
    }
}
