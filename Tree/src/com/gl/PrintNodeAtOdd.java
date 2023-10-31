package com.gl;

public class PrintNodeAtOdd {
     Node root;
     
     void printOddNode(Node node,Boolean isOdd) {
    	 if(node == null)
    		 return;
    	 if(isOdd == true)
    		 System.out.println(node.data + " ");
    	
    	 printOddNode(node.left,!isOdd);
    	 printOddNode(node.right, !isOdd);
    	 
     }
	public static void main(String[] args) {
		PrintNodeAtOdd tree = new PrintNodeAtOdd();
		tree.root = new Node(10);
		tree.root.left = new Node(20);
		tree.root.right = new Node(30);
		tree.root.left.left = new Node(40);
		tree.root.left.right = new Node(50);
		tree.root.left.right.left = new Node(60);
		 
		tree.printOddNode(tree.root,true);
	    

	}

}
