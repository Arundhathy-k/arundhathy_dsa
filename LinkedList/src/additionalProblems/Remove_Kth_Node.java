package additionalProblems;

import java.util.Scanner;

public class Remove_Kth_Node {
	/*
	 * input: 3->5->7->9->11>13->15
	 *  3  removes every 3rd node.
	 * Output: 3->5->9->11->15
	 */
	
Node head;	
	
	void addToTheLast(Node node)
	{
		if(head == null)
		head = node;
		else
		{
			Node temp = head;
			while(temp.next != null)
			temp = temp.next;
			
			temp.next = node;
		} }	
	public static void main(String args[])
    {
         Scanner sc = new Scanner(System.in);
		    System.out.println("Enter the no of elements: ");
			int n = sc.nextInt();
			Remove_Kth_Node list = new Remove_Kth_Node();
			//int n=Integer.parseInt(br.readLine());
		    System.out.println("Enter the elements: ");
			int a1=sc.nextInt();
			Node head= new Node(a1);
            list.addToTheLast(head);
            for (int i = 1; i < n; i++) 
			{
				int a = sc.nextInt(); 
				list.addToTheLast(new Node(a));
			}
            System.out.println("Enter the key: ");
			int K = sc.nextInt();					  
			//System.out.println(list.head.data+" "+ k);
			list.head = new Code().delete(list.head,K); 
			Node temp = list.head;
			while(temp!=null)
			{
				System.out.print(temp.data+ " ");
			    temp = temp.next;
			}
			System.out.println();
			sc.close();
	}
}
 
class Code
{
    
    Node delete(Node head, int K){
    Node temp = head;
	if(K==0) return head;
	while(temp != null){
		int x = K;
		if(x == 1){
		 temp = temp.next;
		  head = temp;
		}
		else {
		 while(temp != null && x > 2){
			x--;
			temp = temp.next;
		 }
		 if(temp != null && temp.next != null){
		  temp.next = temp.next.next;
		  temp = temp.next;
		 }
		 else break;
		}
	}
		return head;
	}
}
 
class Node
{
	Node next;
	int data;
	
	Node(int d)
	{
		data = d;
		next = null;
	}
}


