package com.gl;

public class Stack {
   private int size;
   private int[] arr;
   private int top;
   
   public Stack(int size) {
	   this.size = size;
	   this.arr = new int[size];
	   this.top = -1;	   
   }  
   public void push(int data) {
	   if(isFull()) {
		   System.out.println("stack is already full");
	   }else {
	   top++;
	   arr[top] = data;
	   }
   }  
   public void pop() {
	   if(isEmpty()) {
		   System.out.println("array is empty we cannot perform pop operation");
	   }else {
	     System.out.println("element popped is "+ arr[top]);
	   top--;
	   }
   }  
   public boolean isFull() {
	   return (top==size-1);
   }
    public boolean isEmpty() {
    	return (top==-1);
    }
    public void peek() {
    	System.out.println(arr[top]);
    }
    
    void display() {
    	for(int i=top;i>=0;i--)
    		System.out.println(arr[i]);
    }
   
}
