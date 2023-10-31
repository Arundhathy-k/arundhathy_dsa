package com.gl;

public class Stack_UsingLinkedList {
	Node top;
	int size;

	public Stack_UsingLinkedList() {

		this.top = null;
		this.size = 0;
	}

	public boolean isEmpty(){
		return top==null;
    }

	void push(int data) {
		Node newnode = new Node(data);
		if (isEmpty()) {
			top = newnode;
		}else {
			newnode.nextnode = top;
			top=newnode;
		}
		size++;
	}

	void pop() {
		if (isEmpty()) {
			System.out.println("Underflow");
			return;
		}
		top= top.nextnode;
		size--;
	}
	
	public int peek(){
		if(isEmpty()){
			return -1;
			}
		return top.data;
		}
	
	void display() {
		if (isEmpty())
			return;
		Node tmp = top;
		while (tmp != null) {
			System.out.println(tmp.data+" ");
			tmp = tmp.nextnode;
		}
		System.out.println();
	}
}
