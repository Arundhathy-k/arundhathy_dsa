package com.gl;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo {
	/**
	 * set do not support indexing
	 * sets do not allow duplicates
	 */
	 
	public static void main(String[] args) {
		LinkedHashSet<Integer> nos = new LinkedHashSet<Integer>();
		nos.add(10);
		nos.add(100);
		nos.add(1);
		nos.add(80);
		nos.add(10);
		nos.add(50);
		nos.add(5);
		nos.add(3);
		Iterator<Integer> data = nos.iterator();
		while(data.hasNext())
			System.out.println(data.next());
		System.out.println();
		for(Integer n : nos)
			System.out.println(n);
	
//		// will by default store the elements in naturall ordering
//		Set<Integer> nos1 = new TreeSet<Integer>();
//		nos1.add(10);
//		nos1.add(100);
//		nos1.add(1);
//		nos1.add(80);
//		nos1.add(10);
//		nos1.add(50);
//		nos1.add(5);
//		nos1.add(3);
//		
//		System.out.println();
//		for(Integer n : nos1)
//			System.out.println(n);
//		
//		Set<Employee> emps = new TreeSet<Employee>();
//		
//		emps.add(new Employee(3, "Shalini", "Mumbai", "India"));	
//		emps.add(new Employee(1, "Anuj", "Pune", "India"));
//		emps.add(new Employee(4, "Raju", "Mumbai", "India"));
//		emps.add(new Employee(2, "Vedant", "Delhi", "India"));
//		emps.add(new Employee(5, "Manas", "Chennai", "India"));
//
//		for(Employee emp: emps)
//			System.out.println(emp);
		
		
		Employee e1 = new Employee(3, "Shalini", "Mumbai", "India");
		Employee e2 = new Employee(3, "Shalini", "Mumbai", "India");
		Employee e3 = e1;
		System.out.println(e1==e2);//f
		System.out.println(e1==e3);//t
		System.out.println(e1.equals(e2));//t
		System.out.println(e1.equals(e3));//t
		
		// equals and hashcode methods
		
		Set<Employee> employees = new HashSet<Employee>();
		employees.add(e1);	
		System.out.println();
		employees.add(new Employee(3, "Shalini", "Mumbai", "India"));
		System.out.println();
		employees.add(new Employee(4, "Raju", "Mumbai", "India"));
		System.out.println();
		System.out.println(employees.size());
		for(Employee emp: employees)
			System.out.println(emp);
	}

}
