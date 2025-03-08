package tree;
import java.util.*;

class node6 {
    node6 left;
    node6 right;
    int data;

    public node6(int data) {
        left = right = null;
        this.data = data;
    }
}

public class postorder1stack {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        node6 root = new node6(1);
        root.left = new node6(2);
        root.right = new node6(7);
        root.left.left = new node6(3);
        root.left.right = new node6(6);

        // Get the in-order traversal
        List<Integer> postorder = traversal(root);

        // Print the in-order traversal
        System.out.println("postorder Traversal:");
        for (int num : postorder) {
            System.out.print(num + " ");
        }

    }

    public static List<Integer> traversal(node6 root) {
        List<Integer> postorder = new LinkedList<>();
        Stack<node6> stack = new Stack<>();
        node6 curr = root;

        while (!stack.isEmpty() || curr != null) {
            if (curr != null) {
                stack.push(curr);
                curr = curr.left;
            } else {
                node6 temp = stack.peek().right;
                if (temp == null) {
                    temp = stack.peek();
                    stack.pop();
                    postorder.add(temp.data);
                    while (!stack.isEmpty() && temp == stack.peek().right) {
                        temp = stack.peek();
                        stack.pop();
                        postorder.add(temp.data);
                    }
                } else {
                    curr = temp;
                }
            }
        }

        return postorder;
    }
}
