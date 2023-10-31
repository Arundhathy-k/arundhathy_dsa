package additionalProblems;

import java.util.Scanner;
import com.gl.Node;
public class SumOfTwoList {

	void addTwolsts(Node first, Node second) {
		Node start1 = new Node(0);
		start1.next = first;
		Node start2 = new Node(0);
		start2.next = second;
		addPrecedingZeros(start1, start2);
		Node result = new Node(0);
		if (sumTwoNodes(start1.next, start2.next, result) == 1) {
			Node node = new Node(1);
			node.next = result.next;
			result.next = node;
		}
		printlst(result.next);
	}

	private int sumTwoNodes(Node first, Node second, Node result) {
		if (first == null) {
			return 0;
		}
		int number = first.data + second.data + sumTwoNodes(first.next, second.next, result);
		Node node = new Node(number % 10);
		node.next = result.next;
		result.next = node;
		return number / 10;
	}

	private void addPrecedingZeros(Node start1, Node start2) {
		Node next1 = start1.next;
		Node next2 = start2.next;
		while (next1 != null && next2 != null) {
			next1 = next1.next;
			next2 = next2.next;
		}
		if (next1 == null && next2 != null) {
			while (next2 != null) {
				Node node = new Node(0);
				node.next = start1.next;
				start1.next = node;
				next2 = next2.next;
			}
		} else if (next2 == null && next1 != null) {
			while (next1 != null) {
				Node node = new Node(0);
				node.next = start2.next;
				start2.next = node;
				next1 = next1.next;
			}
		}
	}

	void printlst(Node head) {
		while (head != null) {
			System.out.print(head.data+" ");
			head = head.next;
		}
	}

	Node insert(Node head, int item) {
		Node tmp = new Node(item);
		if (head == null) {
			head = tmp;
			return head;
		}

		Node tmp1 = head;
		while (tmp1.next != null)
			tmp1 = tmp1.next;
		tmp1.next = tmp;
		return head;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Node head1 = null, head2 = null;
		System.out.println("Enter the size of list1: ");
		int n1 = in.nextInt();
		System.out.println("Enter the size of list2: ");
		int n2 = in.nextInt();
		SumOfTwoList lst1 = new SumOfTwoList();
		SumOfTwoList lst2 = new SumOfTwoList();
		System.out.println("Enter the elements of list1:  ");
		while (n1-- > 0)
			head1 = lst1.insert(head1, in.nextInt());
		System.out.println("Enter the elements of list1:  ");
		while (n2-- > 0)
			head2 = lst2.insert(head2, in.nextInt());

		lst1.addTwolsts(head1, head2);
		in.close();
	}

}

