package com.gl;

public class Queue {
  private int size;
  private int arr[];
  private int front;
  private int rear;
  
  
  public Queue(int size) {
	  this.size = size;
	  this.arr = new int[size];
	  front = 0;
	  rear = -1;
  }
  
  public void enqueue(int data) {
	  if(isFull()) {
		  System.out.println("queue is full");
	  }else
	  rear++;
	  arr[rear] = data;
	 
  }
  public void dequeue() {
	  if(rear==-1) {
		  System.out.println("cannot remove");
	  }else {
		  front++;
		 	  }
  }
  public void display() {
	  for(int i=0;i<=rear;i++) {
		  System.out.println(arr[i]+" ");
	  }
  }
  
  public boolean isEmpty() {
	  return (front ==0);
  }
  public boolean isFull() {
	  return (rear == size-1);
  }
  public void peekFront() {
	  System.out.println(arr[front]);
  }
  public void peekRear() {
	  System.out.println(arr[rear]);
  }
  public void size() {
	  System.out.println(rear+1);
  }
}
