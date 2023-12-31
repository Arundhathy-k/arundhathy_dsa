package com.gl;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		// FILO
		
		Stack<Integer> numbers = new Stack<Integer>();
		numbers.add(1);
		numbers.add(4);
		numbers.add(2);
		numbers.add(6);
		numbers.add(3);
		numbers.add(2);
		numbers.add(100);
		numbers.add(20);
		numbers.add(2);
		
		System.out.println(numbers.indexOf(2));
		System.out.println(numbers.indexOf(2, 3));
		System.out.println(numbers.search(100));
		System.out.println(numbers.search(1000));
		
		System.out.println(numbers.peek());
		System.out.println(numbers);
		System.out.println(numbers.pop());
		System.out.println(numbers);
		Stack<Integer> numbers1 = numbers;
		numbers1.add(100);
		System.out.println(numbers);
		System.out.println(numbers1);
		
		@SuppressWarnings("unchecked")
		Stack<Integer> numbers2 = (Stack<Integer>) numbers.clone();
		numbers2.add(10);
		System.out.println(numbers);
		System.out.println(numbers1);
		System.out.println(numbers2);
		Stack<Employee> emps = new Stack<>();
		emps.add(new Employee(1, "Shalini", "Mumbai", "India"));
		emps.add(new Employee(2, "Anuj", "Pune", "India"));
		emps.add(new Employee(3, "Raju", "Mumbai", "India"));
		emps.add(new Employee(4, "Vedant", "Delhi", "India"));
		emps.add(new Employee(5, "Manas", "Chennai", "India"));
		while(!emps.isEmpty())
		{
			System.out.println(emps.pop());
		}
		System.out.println(emps);
	}
}
