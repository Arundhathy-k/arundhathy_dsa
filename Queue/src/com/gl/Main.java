package com.gl;

public class Main {

	public static void main(String[] args) {
		Queue obj = new Queue(5);
		obj.enqueue(10);
		obj.enqueue(20);
		obj.enqueue(30);
		obj.enqueue(40);
		obj.enqueue(50);
		obj.display();
		obj.dequeue();
		obj.display();
	}

}
