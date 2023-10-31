package additionalProblems;

import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {
	 // 1. Declare required variables and objects
	Stack<Character> stack = new Stack<>();
	Scanner sc = new Scanner(System.in);
	String str;
	 public void getData() {
		 
	 // Get testing braces from user
		 System.out.println("Enter the testing braces:");
		  str = sc.nextLine();
	 }
	 // function to check if brackets are balanced
	 
	 public boolean checkingBracketsBalanced() {
	 for(int i=0;i<str.length();i++) {
		if(str.charAt(i)=='(' || str.charAt(i)=='{' || str.charAt(i)=='[' ) {
			stack.push(str.charAt(i));
		}
		else if(str.charAt(i)==')'|| str.charAt(i)=='}' || str.charAt(i)==']' ) {
			if(stack.isEmpty()==true) {
				return false;
			}
			else {
			stack.pop();
		}
		}
	 }
		 
	 return (stack.isEmpty());
	 }
	 // Driver code
	public static void main(String[] args) {
		// 1. Declare variables and create object
		
		 Boolean result;
		 BalancedBrackets balancedBrackets = new BalancedBrackets ();
		 // 2. Implement required methods
		 balancedBrackets.getData();
		 result = balancedBrackets.checkingBracketsBalanced();
		 // 3. Based on the result, print if the brackets are balanced or not
		 if (result)
		 System.out.println("The entered String has Balanced Brackets");
		else
		 System.out.println("The entered Strings do not contain Balanced Brackets ");
		 }
		 }


	


