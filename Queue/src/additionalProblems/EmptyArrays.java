package additionalProblems;

import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.*;
public class EmptyArrays {

	/*
	 * In the first operation, you are allowed to rotate the first array element
	 * clockwise. In the second operation, when the first element of both the arrays
	 * is the same, they are removed from both the arrays and the process continues.
	 * Sample Input:
	 *  3 
	 *  1 3 2 
	 *  2 3 1 
	 *  Sample Output 6
	 */
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the no of elements:");
	    int n = sc.nextInt();
	    int [] a = new int[n];
	    int [] b = new int[n];
	    System.out.println("Enter the elements of array a:");
	    for(int i=0;i<n;i++){
	     a[i] = sc.nextInt();
	    }
	    System.out.println("Enter the elements of array b:");
	    for(int i=0;i<n;i++){
	     b[i] = sc.nextInt();
	    } 
	     int time = 0;
	       Deque<Integer> queueA = new ArrayDeque<>();
	       Deque<Integer> queueB = new ArrayDeque<>();
	        
	        for (int i = 0; i < n; i++) {
	            queueA.offer(a[i]);
	            queueB.offer(b[i]);
	        }
	        
	        while (!queueA.isEmpty()) {
	            if (queueA.peek().equals(queueB.peek())) {
	                queueA.poll();
	                queueB.poll();
	                time++;
	            } else {
	                queueA.offer(queueA.poll());
	                time++;
	            }
	        }
	        
	        System.out.println(time); 
	        sc.close();
	    }
	}   

