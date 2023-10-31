package additionalProblems;

import java.util.Scanner;

import com.gl.Node;

public class ReorderLinkedList {
	/*
	 * User Input:6 
	 * 1 2 3 4 5 6 
	 * output: 1 6 2 5 3 4
	 */
	static Node head;

	  public void reorderList() {
	    if(head.next == null || head.next.next == null)
	     return;
	    Node temp1 = head;
	    Node temp2 = head;
	    while(temp2 != null && temp2.next != null){
	      temp1 = temp1.next;
	      temp2 = temp2.next.next;
	    }
	    Node reverseList = reverse(temp1.next);
	    temp1.next = null;
	    Node pntr1 = head;
	    Node pntr2 = reverseList;
	    while(pntr2 != null){
	      Node next1 = pntr1.next;
	      Node next2 = pntr2.next;
	      pntr1.next = pntr2;
	      pntr1 = next1;
	      pntr2.next = pntr1;
	      pntr2 = next2;
	    }
	  } 

	  public Node reverse(Node head) {
	    Node curr = head, prev = null, nex = null;
	    while (curr != null) {
	      nex = curr.next;
	      curr.next = prev;
	      prev = curr;
	      curr = nex;
	    }
	    return prev;
	  }

	  void insert(int value) {
	    Node newNode = new Node(value);

	    if (head == null) {
	      head = newNode;
	      return;
	    }

	    newNode.next = null;

	    Node tmp = head;
	    while (tmp.next != null)
	      tmp = tmp.next;

	    tmp.next = newNode;
	    return;
	  }

	  void display() {
	    Node tmp = head;
	    while (tmp != null) {
	      System.out.println(tmp.data);
	      tmp = tmp.next;
	    }
	  }

	  public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    ReorderLinkedList ob = new ReorderLinkedList();
	    System.out.println("Enter the no.of nodes: ");
	    int numberOfNodes = in.nextInt();
	    System.out.println("Enter the elements: ");
	    while (numberOfNodes--> 0)
	      ob.insert( in.nextInt());
	    ob.reorderList();
	    ob.display();
in.close();
	  }
}
