package com.gl;
import java.util.ArrayDeque;
public class Deque {

	public static void main(String[] args) {
		ArrayDeque <Integer> ad = new ArrayDeque<>();
         ad.add(10);
         ad.add(20);
         ad.add(30);
         System.out.print(ad+ " ");
         System.out.println(ad.peek());
         System.out.println(ad.poll());
         System.out.print(ad);	
         System.out.println(ad.offer(10));
         ad.offer(20);
         System.out.println(ad+ " ");
	}

}
