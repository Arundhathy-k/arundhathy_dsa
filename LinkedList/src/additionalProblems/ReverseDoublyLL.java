package additionalProblems;

import java.util.Scanner;

public class ReverseDoublyLL {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DoublyLinkedList list = new DoublyLinkedList();
		System.out.println("Enter the count: ");
		int count = sc.nextInt();
		System.out.println("Enter the elements: ");
		while (count-- > 0) {
			list.addNewNode(sc.nextInt());
		}
		list.printNodesUsingHead();
		System.out.println();
		list.printNodesUsingTail(list.tail);
		sc.close();
	}
}

class DoublyLinkedList {
	class Node {
		int item;
		Node prev;
		Node next;

		public Node(int item) {
			this.item = item;
		}
	}

	Node head = null, tail = null;

	public void addNewNode(int item) {
		
		Node newNode = new Node(item);
		if (head == null) {
			head = tail = newNode;
			head.prev = null;
			tail.next = null;
		} else {
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
			tail.next = null;
		}
	}

	public void printNodesUsingHead() {
		Node current = head;
		if (head == null) {
			return;
		}
		while (current != null) {
			System.out.print(current.item + " ");
			current = current.next;
		}
	}

	public void printNodesUsingTail(Node temp) { // print in reverse order
		if (temp != null) {
			System.out.print(temp.item + " ");
			printNodesUsingTail(temp.prev);
		}
	}

}
