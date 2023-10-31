package com.gl;
public class FindLeafNodes {
    Node root;
    
    int countLeafNodes(Node node) {
    	
    	if(node == null)
    		return 0;
    	if(root.left == null && root.right == null)
    			return 1;
    	else
    		return countLeafNodes(node.left)+countLeafNodes(node.right);
    	
    }
    
	public static void main(String[] args) {
	FindLeafNodes tree = new FindLeafNodes();
	
	tree.root = new Node(10);
	tree.root.left = new Node(20);
	tree.root.right = new Node(30);
	tree.root.left.left = new Node(40);
	tree.root.left.right = new Node(50);
	tree.root.left.right.left = new Node(60);
	 
	int result =  tree.countLeafNodes(tree.root);
    System.out.println(result);
	}

}
