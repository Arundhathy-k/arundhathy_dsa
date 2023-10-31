package com.gl;
public class BinaryTree {
      
	Node root;
	void printFullNode(Node node) {
		if(node == null)
			return ;
		if(node.left !=null & node.right!= null)
			System.out.print(node.data + " ");
		printFullNode(node.left);
		printFullNode(node.right);
	}
	
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		
		tree.root = new Node(10);
		tree.root.left = new Node(20);
		tree.root.right = new Node(30);
		tree.root.left.left = new Node(40);
		tree.root.left.right = new Node(50);
		tree.root.left.right.left = new Node(60);
       // tree.printFullNode(tree.root);
	   // tree.printNodeAtLevel(tree.root, 3);
		System.out.println("Inorder");
		tree.printInOrder(tree.root);
		System.out.println("Preorder");
		tree.printPreOrder(tree.root);
		System.out.println("Postorder");
		tree.printPostOrder(tree.root);
	}
	void printPreOrder(Node node) {
		if(node == null)
			return;
		System.out.println(node.data+ " ");
		printPreOrder(node.left);
		printPreOrder(node.right);
		
	}
	void printInOrder(Node node) {
		if(node == null)
			return;
		printInOrder(node.left);
		System.out.println(node.data+ " ");
		printInOrder(node.right);
	}
	void printPostOrder(Node node) {
		if(node == null)
			return;
		printPostOrder(node.left);
		printPostOrder(node.right);
		System.out.println(node.data+ " ");
	}
	void printNodeAtLevel(Node node,int level) {
		if(node == null)
			return;
		if(level==1)
			System.out.print(node.data+ " ");
		printNodeAtLevel(node.left, level-1);
		printNodeAtLevel(node.right, level-1);
		
	}

}
