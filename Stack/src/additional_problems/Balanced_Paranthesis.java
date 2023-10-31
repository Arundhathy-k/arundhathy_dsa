package additional_problems;


import java.util.Scanner;
import java.util.Stack;

public class Balanced_Paranthesis {
	
	 public static int isBalanced(String A) {
	      Stack<Character> stack = new Stack<>();
	       for(char c:A.toCharArray()){
	           if(c =='('){
	               stack.push(c);
	               }
	               else if(c==')')
	               {
	    if(stack.isEmpty()||stack.pop()!='('){
	        return 0;
	        }
	        }
	        }
	        return stack.isEmpty() ? 1 : 0 ;

	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter the string: ");
	        String A = scanner.nextLine();
	        
	        int result = isBalanced(A);
	        System.out.println(result);
	        scanner.close();
	    }
	}
