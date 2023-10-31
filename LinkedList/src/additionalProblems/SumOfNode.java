package additionalProblems;

import java.util.Scanner;

import com.gl.Node;

public class SumOfNode {

	public static void main(String[] args) {
		Node head, current;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size:");
		int size = sc.nextInt();
		System.out.println("Enter the k value:");
		int k = sc.nextInt();
		System.out.println("Enter the elements:");
		head = new Node(sc.nextInt());
		current = head;
		for (int i = 1; i < size; i++) {
			current.next = new Node(sc.nextInt());
			current = current.next;
		}
		Sum obj=new Sum();
		System.out.println(obj.sumOfNode(head,k));
		sc.close();
	}
}

class Sum {
	public int sumOfNode(Node head, int k) {
		int sum = 0, count = 1;
		Node temp = head;
		while (temp.next != null) {
			count++;
			temp = temp.next;
		}
		temp = head;
		int c = 0;
		while (temp != null) {
			c++;
			if ((count - k) < c)
				sum += temp.data;
			temp = temp.next;
		}
		return sum;
	}
}