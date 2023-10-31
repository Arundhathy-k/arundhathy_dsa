package com.gl;

public class SinglyLinkedList {
  private Node head;
  
  //code to check if the list is empty
  
  public boolean isEmpty() {
	  return (head==null);
  }
  // logic to insert a node at the beg of the list
  public void insertFirst(int data) {
	  Node newnode = new Node(data);
	  newnode.next = head;
	  head = newnode;		  
  }
  
  //delete the node at first
  public void deleteFirst() {
	  head = head.next;	
 }
  
  public void displayList() {
	  System.out.println("List from first to last -->");
	  Node current = head;
	  
	  while(current!=null) {
		  current.displayNode();
		  current = current.next;
	  }
	  System.out.println();
  }
  
  public void insertLast(int data) {
	  Node current = head;
	  while(current.next!=null) {
		  current = current.next;
	  }
	  Node newNode = new Node(data);
	  	  current.next = newNode;
  }
  public void deleteLast() {
	  Node current = head;
	  while(current.next.next!=null) {
		  current = current.next;
	  }
	  current.next = null;
  }
  public void insertAtPos(int data,int pos){
	  Node current=head;
	  Node tempNode=head;
	  for(int i=0;i<pos-1;i++){
		  current=current.next;
		  tempNode=tempNode.next;
		  }
	  current=current.next;
	  Node newNode=new Node(data);
	  tempNode.next=newNode;
	  newNode.next=current;
 }
    public void deleteAt_Specific_Position(int pos){
	  //required to traverse 
	  Node temp=head;
	  Node previous=null;
	  //traverse to the nth node
	  for(int i=0;i<pos;i++){ 
		  previous=temp;
		  temp=temp.next;
		  }
	  //assigned next node of the previous node to nth node next
	  previous.next=temp.next;
	  }
  public void Search(int key){
	  Node current=head;
	  while(current!=null){
		  if(current.data==key){
			  System.out.println("Data " + current.data + " found.");
			  System.exit(0);
			  //successful termination
			  }
		  current=current.next;
		  }
	  System.out.println("Key Not found");
		  }
	  }
  
 
