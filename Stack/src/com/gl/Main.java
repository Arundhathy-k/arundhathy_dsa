package com.gl;

public class Main {

	public static void main(String[] args) {
		/*
		 * Stack stack = new Stack(5); 
		 * stack.pop();
		 * stack.push(10);
		 *  stack.push(20);
		 * stack.push(30);
		 *  stack.push(40);
		 *   stack.push(50);
		 *    stack.display();
		 * System.out.println();
		 *  stack.push(60);
		 *   stack.pop();
		 *    stack.display();
		 * System.out.println();
		 *  stack.push(70);
		 *   stack.display();
		 *   System.out.println();
		 * stack.peek();
		 */

		Stack_UsingLinkedList obj = new Stack_UsingLinkedList();
		obj.push(10);
		obj.push(20);
		obj.pop();
		obj.display();
	}

}
