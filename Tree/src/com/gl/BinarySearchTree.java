package com.gl;

public class BinarySearchTree {

	Node root;

	void insertNode(int key) {
		root = insertNode(root, key);
	}

	Node insertNode(Node root, int key) {
		if (root == null) {
			root = new Node(key);
			return root;
		} else if (key < root.data) {

			root.left = insertNode(root.left, key);
		} else if (key > root.data) {

			root.right = insertNode(root.right, key);
		}
		return root;
	}

	void printPreOrder(Node node) {
		if (node == null)
			return;
		System.out.println(node.data + " ");
		printPreOrder(node.left);
		printPreOrder(node.right);

	}

	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		bst.insertNode(100);
		bst.insertNode(20);
		bst.insertNode(1);
		bst.insertNode(30);
		bst.insertNode(120);
		bst.insertNode(180);

		bst.printPreOrder(bst.root);

	}

}
