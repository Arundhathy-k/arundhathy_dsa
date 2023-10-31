package additionalProblems;

import java.util.Scanner;

public class Reverse_CircularLL {
	static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static Node reverseList(Node head) {
       Node prev=null;
       Node current=head;
       Node next=null;
       do{
          next=current.next;
          current.next=prev;
          prev=current;
          current=next;
          }
          while(current!=head);
              head.next=prev;
              head=prev;
              return head;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no.of elements: ");
        int n = scanner.nextInt();
        System.out.println("Enter the elements: ");
        Node head = new Node(scanner.nextInt());
        Node tail = head;

        for (int i = 1; i < n; i++) {
            tail.next = new Node(scanner.nextInt());
            tail = tail.next;
        }

        tail.next = head; // Making it circular

        Node reversedHead = reverseList(head);
        printList(reversedHead);
        scanner.close();
    }

    public static void printList(Node head) {
        Node current = head;
        do {
            System.out.print(current.val + " ");
            current = current.next;
        } while (current != head);
        System.out.println();
    }
}
