package additionalProblems;

import java.util.Scanner;

import com.gl.Node;

public class DeleteAlternate {

	public static void main(String[] args) {
		Node head, current;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of elements to be added:");
		int n = sc.nextInt();
		System.out.println("Enter the elements:");
		int d1 = sc.nextInt();
		head = new Node(d1);
		current = head;
		for(int i=1;i<n;i++) {
			current.next = new Node(sc.nextInt());
			current = current.next;
		}
		Solution obj = new Solution();
		Node newHead = obj.deleteAlternate(head);
		while (newHead != null) {
			System.out.print(newHead.data + " ");
			newHead = newHead.next;
		}
		System.out.println();
		sc.close();
	}
}

class Solution {
	public Node deleteAlternate(Node head) {
		Node current = head;
		Node temp = head.next;
		while (current != null && temp != null) {
			current.next = temp.next;
			temp = null;
			current = current.next;
			if (current != null) {
				temp = current.next;
			}
		}
		return head;
	}
}

