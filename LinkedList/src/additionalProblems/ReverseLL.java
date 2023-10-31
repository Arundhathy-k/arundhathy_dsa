package additionalProblems;

import java.util.Scanner;

import com.gl.Node;

public class ReverseLL {

	public static void main(String[] args) {
		Node head, current;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of elements:");
		int n = sc.nextInt();
		System.out.println("Enter the elements:");
		head = new Node(sc.nextInt());
		current = head;
		for (int i = 1; i < n; i++) {
			current.next = new Node(sc.nextInt());
			current = current.next;
		}
		ReverseLL rllist = new ReverseLL();
		rllist.printReverse(head);
		sc.close();

	}

	public void printReverse(Node head) {
		Node current = head;
		if (current.next == null) {
			System.out.print(current.data + " ");
			return;
		}
		printReverse(current.next);
		System.out.print(current.data + " ");
	}	
}
