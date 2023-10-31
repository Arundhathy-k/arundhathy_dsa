package com.gl;

public class DoublyLinkedList {
	 private Node first;
     private Node last;
	 
	  public DoublyLinkedList() {
		 this.first=null;
		  this.last=null;
	  }
	  
	  public boolean isEmpty() {
		  return first==null;
	  }
	  
	  public void insertFirst(int data) {
		Node newnode = new Node(data);
		  
		  if(isEmpty()) {
			  last=newnode;
		  }else {
			  first.prev = newnode;
		  }
		  newnode.next = first;
		  this.first= newnode;
		 
	  }
	  
	  public void insertLast(int data) {
		  Node newnode = new Node(data);
		  	  if(isEmpty()) {
			  first=newnode;
		  }else {
		  last.next = newnode;
		  newnode.prev = last;
		  }
		  	  last = newnode;
	  }
	  public void deleteFirst() {
		  if(first.next == null) {
			  last=null;
		  }else {
			  first.next.prev = null;
		  }
		  first=first.next;
	  }
	  public void deleteLast() {
		  if(first.next == null) {
			  first=null;
		  }else {
			  last.prev.next = null;
		  }
		 last = last.prev;
	  }
	  public void displayList() {
		 System.out.println("list from first --> last");
		 Node current =first;
		 while(current !=null) {
			 current.displayNode();
			 current=current.next;
		 }
		 System.out.println();
	  }   
}

