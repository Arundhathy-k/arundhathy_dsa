package com.gl;

public class CircularLinkedList {
  private Node first;
  private Node last;
  
  public CircularLinkedList() {
	  first=null;
	  last=null;
  }
  
  public boolean isEmpty() {
	  return first==null;
  }
  
  public void insertFirst(int data) {
	Node newnode = new Node(data);
	  if(isEmpty()) {
		  last=newnode;
	  }
	  newnode.next = first;
	  first= newnode;
	  if(first!=null) {
	  Node current = first;
	  while(current.next!=first) 
		  current = current.next;
	  current.next= newnode;  // last points to new node;
	  }
	  else
		  newnode.next = newnode;
  }
  
  public void insertLast(int data) {
	  Node newnode = new Node(data);
	  	  if(isEmpty()) {
		  first=newnode;
	  }else {
		newnode=  last.next;
	  last.next = newnode;
	  last= newnode;
	  }
  }
  public void deleteFirst() {
	  if(first.next == null) {
		  last=null;
	  }
	  first=first.next;
  }
  public void deleteLast() {
	  if(first.next ==null) {
		  first=null;
	  }
	  Node current = first;
	  while(current.next.next!=null) {
		  current=current.next;
	  }
		last = current;
		current.next =null;
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
  public void insertAtPositon(int pos,int data) {
	  Node newnode = new Node(data);  
	  if (first == null) {
          first = newnode;
          first.next = first;
      } else {
          Node current = first;
          int count = 1;

          // Traverse to the node just before the specified position
          while (count < pos- 1) {
              current = current.next;
              count++;
          }

          // Insert the new node after the current node
          newnode.next = current.next;
          current.next = newnode;
      }
  }
}
