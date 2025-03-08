package tree;

import java.util.*;

class Node1 {
    Node1 left, right;
    int data;

    // Constructor
    Node1(int data) {
        this.data = data;
        left = right = null;
    }
}

public class BinaryTree {
    public static void main(String[] args) {
        // Create a binary tree
        System.out.println("Enter the root node:");
        Node1 root = createTree();

        System.out.println("In-order traversal of the initial tree:");
        inorder(root);
        System.out.println();

        // Insert a new node
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value to insert:");
        int insertValue = sc.nextInt();
        root = insert(root, insertValue);

        System.out.println("In-order traversal after insertion:");
        inorder(root);
        System.out.println();

        // Delete a node
        System.out.println("Enter a value to delete:");
        int deleteValue = sc.nextInt();
        root = delete(root, deleteValue);

        System.out.println("In-order traversal after deletion:");
        inorder(root);
        System.out.println();
    }

    // Function to create a tree
    public static Node1 createTree() {
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        if (data == -1) {
            return null;
        }
        Node1 root = new Node1(data);
        System.out.println("Enter the left child of " + data);
        root.left = createTree();
        System.out.println("Enter the right child of " + data);
        root.right = createTree();
        return root;
    }

    // In-order traversal (LNR)
    public static void inorder(Node1 root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // Pre-order traversal (NLR)
    public static void preorder(Node1 root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    // Post-order traversal (LRN)
    public static void postorder(Node1 root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    // Function to insert a node into the BST
    public static Node1 insert(Node1 root, int data) {
        if (root == null) {
            return new Node1(data);
        }
        if (data < root.data) {
            root.left = insert(root.left, data);
        } else if (data > root.data) {
            root.right = insert(root.right, data);
        }
        return root;
    }

    // Function to delete a node from the BST
    public static Node1 delete(Node1 root, int data) {
        if (root == null) {
            return null;
        }
        if (data < root.data) {
            root.left = delete(root.left, data);
        } else if (data > root.data) {
            root.right = delete(root.right, data);
        } else {
            // Node to be deleted found
            // Case 1: No child
            if (root.left == null && root.right == null) {
                return null;
            }
            // Case 2: One child
            else if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            // Case 3: Two children
            else {
                Node1 minNode = findMin(root.right);
                root.data = minNode.data;
                root.right = delete(root.right, minNode.data);
            }
        }
        return root;
    }

    // Helper function to find the minimum value node in a subtree
    public static Node1 findMin(Node1 root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }
}
