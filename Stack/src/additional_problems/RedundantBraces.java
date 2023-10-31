package additional_problems;

import java.util.Scanner;
import java.util.Stack;

public class RedundantBraces {
	public int  hasRedundantBraces(String A){
		Stack <Character> stack = new Stack<>();
		for(char c:A.toCharArray()){
		    if(c ==')'){
		        char top = stack.pop();
		        boolean isRedundant=true;
		        while(top!='('){
		            if(top == '+'||top=='-'||top=='*'||top=='/'){
		                isRedundant=false;
		                }
		                top=stack.pop();
		                }
		                if(isRedundant){
		                    return 1;
		                    }
		                    }
		                    else{
		                        stack.push(c);
		                    }
		                    }
		                    return 0;
		                    }
}
 class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String expression = scanner.nextLine();

        RedundantBraces rb = new RedundantBraces();
        int result = rb.hasRedundantBraces(expression);

        if (result == 1) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
        scanner.close();
    }
}