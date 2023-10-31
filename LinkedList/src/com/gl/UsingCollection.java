package com.gl;

import java.util.LinkedList;
public class UsingCollection {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.addLast(20);
        list.addFirst(5);
        System.out.println(list);        
        System.out.println(list.size());
        System.out.println(list.get(0));
        System.out.println(list.indexOf(20));
        
        for(int i=list.size()-1;i>=0;i--) {
        	System.out.print(list.get(i)+ " ");
        }
	}

}
