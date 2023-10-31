package com.gl;
public class FindHeightOfTree {
    
	Node root;
	
	int findHeight(Node node) {
		if(node == null)
			return 0;
		else {
			int heightLeftSubTree = findHeight(node.left);
			int heightRightSubTree = findHeight(node.right);
			if(heightLeftSubTree> heightRightSubTree)
				return (heightLeftSubTree + 1);
			else
				return (heightRightSubTree + 1);
		}
	}
	public static void main(String[] args) {
	 FindHeightOfTree tree = new FindHeightOfTree();
	 
	 tree.root = new Node(10);
	 tree.root.left = new Node(20);
	 tree.root.right = new Node(30);
	 tree.root.left.left = new Node(40);
	 tree.root.left.right = new Node(50);
	 tree.root.left.right.left = new Node(60);
    int result =  tree.findHeight(tree.root);
    System.out.println(result);
	}

}
