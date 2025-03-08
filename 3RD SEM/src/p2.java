
class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    public TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class BinaryTree {
    TreeNode root;

    public BinaryTree() {
        this.root = null;
    }

    // Method to insert a node into the binary tree
    public void insert(int data) {
        root = insertRecursive(root, data);
    }

    private TreeNode insertRecursive(TreeNode root, int data) {
        if (root == null) {
            return new TreeNode(data);
        }

        if (data < root.data) {
            root.left = insertRecursive(root.left, data);
        } else if (data > root.data) {
            root.right = insertRecursive(root.right, data);
        }

        return root;
    }

    // Method to print the inorder traversal of the binary tree
    public void printInorder() {
        printInorderRecursive(root);
        System.out.println();
    }

    private void printInorderRecursive(TreeNode root) {
        if (root != null) {
            printInorderRecursive(root.left);
            System.out.print(root.data + " ");
            printInorderRecursive(root.right);
        }
    }
}

public class p2 {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        // Insert nodes into the binary tree
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        // Print the inorder traversal of the binary tree
        System.out.println("Inorder Traversal:");
        tree.printInorder();
    }
}
