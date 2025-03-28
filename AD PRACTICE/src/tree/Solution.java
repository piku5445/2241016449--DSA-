package tree;

import java.util.Queue;
import java.util.LinkedList;
class Node {
    public int data;
    public Node left;
    public Node right;

    Node()
    {
        this.data = 0;
        this.left = null;
        this.right = null;
    }

    Node(int data)
    {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    Node(int data, Node left, Node right)
    {
        this.data = data;
        this.left = left;
        this.right = right;
    }
}
public class Solution {
	public static void main(String[]args) {
		int ar[]= {1,2,3,4,5,6};
		Node root=createTree(ar);
		printLevelOrder( root);
		
	}
	
	   public static Node createTree(int[] arr) {
	        if (arr == null || arr.length == 0) {
	            return null;
	        }

	        Queue<Node> q = new LinkedList<>();
	        Node root = new Node(arr[0]);
	        q.offer(root);

	        int i = 1; // Start from the second element of the array

	        while (!q.isEmpty() && i < arr.length) {
	            Node t = q.poll();

	            // Create the left child node with the value from the corresponding index in the array
	            if (i < arr.length) {
	                Node left = new Node(arr[i++]);
	                t.left = left;
	                q.offer(left);
	            }

	            // Create the right child node with the value from the corresponding index in the array
	            if (i < arr.length) {
	                Node right = new Node(arr[i++]);
	                t.right = right;
	                q.offer(right);
	            }
	        }

	        return root;
	    }

    public static void printLevelOrder(Node root) {
        if (root == null) {
            System.out.println("Tree is empty.");
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();

            for (int i = 0; i < levelSize; i++) {
                Node current = queue.poll();
                System.out.print(current.data + " ");

                if (current.left != null) {
                    queue.offer(current.left);
                }

                if (current.right != null) {
                    queue.offer(current.right);
                }
            }
            System.out.println();
        }
}}