package com.gl;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
public static void main(String[] args) {
		
		Queue<String> cities = new LinkedList<String>();
		cities.add("Mumbai");
		cities.add("Delhi");
		cities.add("Pune");
		cities.add("Agra");
		cities.add("Chennai");

		
		System.out.println(cities);
		System.out.println(cities.poll());
		System.out.println(cities.poll());
		System.out.println(cities.poll());
		System.out.println(cities.poll());
		System.out.println(cities.poll());
		
		// always follows natural ordering of the elements
		Queue<String> cities1 = new PriorityQueue<String>();
		cities1.add("Mumbai");
		cities1.add("Delhi");
		cities1.add("Pune");
		cities1.add("Agra");
		cities1.add("Chennai");
		cities1.add("agartala");

		System.out.println(cities1);
		System.out.println(cities1.poll());
		System.out.println(cities1.poll());
		System.out.println(cities1.poll());
		System.out.println(cities1.poll());
		System.out.println(cities1.poll());
		System.out.println(cities1.poll());
		
		Queue<Integer> prices = new PriorityQueue<Integer>(Collections.reverseOrder());
		prices.add(10);
		prices.add(12);
		prices.add(6);
		prices.add(34);
		prices.add(5);
		prices.add(110);
		prices.add(1);
		prices.add(63);
		prices.add(24);
		prices.add(15);
		
		for(Integer p:prices)
			System.out.print(p+" ");
		System.out.println();
		while(!prices.isEmpty())
			System.out.println(prices.poll());
		
//		Queue<Employee> emps = new PriorityQueue<Employee>();
//		System.out.println("adding employee 1");
//		emps.add(new Employee(3, "Shalini", "Mumbai", "India"));
//		System.out.println("adding employee 2");
//		emps.add(new Employee(1, "Anuj", "Pune", "India"));
//		emps.add(new Employee(4, "Raju", "Mumbai", "India"));
//		emps.add(new Employee(2, "Vedant", "Delhi", "India"));
//		emps.add(new Employee(5, "Manas", "Chennai", "India"));
//		while(!emps.isEmpty())
//			System.out.println(emps.poll());
	}
}
