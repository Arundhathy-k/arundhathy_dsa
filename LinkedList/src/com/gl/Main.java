package com.gl;

public class Main {

	public static void main(String[] args) {
		
		  SinglyLinkedList obj = new SinglyLinkedList();
		  
		  obj.insertFirst(10);
		  obj.insertFirst(20);
		  obj.insertFirst(30);
		  obj.insertFirst(40);
		  obj.insertFirst(50); 
		  obj.insertLast(60);
		  obj.insertLast(70);
		  obj.displayList();
		  System.out.println("Delete opearation");
		  obj.deleteFirst();
		  obj.displayList();
		  obj.deleteLast();
		  obj.displayList();
		  obj.insertAtPos(80, 2);
		  obj.displayList();
		  obj.deleteAt_Specific_Position(3);
		  obj.displayList();
		  obj.Search(80);
		
		 
	
		
			/*
			 * CircularLinkedList obj1 = new CircularLinkedList(); obj1.insertFirst(10);
			 * obj1.insertFirst(20); obj1.insertLast(30); obj1.insertLast(40);
			 * obj1.displayList(); obj1.deleteFirst(); obj1.displayList();
			 * obj1.deleteLast(); obj1.displayList();
			 * System.out.println("enter the position you want"); obj1.insertAtPositon(2,
			 * 50); obj1.displayList();
			 */
		 
		
		/*
		 * DoublyLinkedList obj2 = new DoublyLinkedList(); obj2.insertFirst(10);
		 * obj2.insertFirst(20); obj2.insertLast(30); obj2.insertLast(40);
		 * obj2.displayList(); obj2.deleteFirst(); obj2.displayList();
		 * obj2.deleteLast(); obj2.displayList();
		 */

		
	}

}
