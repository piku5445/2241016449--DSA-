package tree;

//package tree;
import java.util.*;

class node {
    node left;
    node right;
    int data;
    
    node(int data) {
        this.data = data;
        left = right = null;
    }
    
}

class solution {
    public List<List<Integer>> levelorder(node root) {
        Queue<node> queue = new LinkedList<>();
        List<List<Integer>> wraplist = new LinkedList<List<Integer>>();
        
        if (root == null) {
            return wraplist;
        }
        
        queue.offer(root);
        
        while (!queue.isEmpty()) {
            int levelnum = queue.size();
            List<Integer> sublist = new LinkedList<Integer>();
            
            for (int i = 0; i < levelnum; i++) {
                node current = queue.poll();
                sublist.add(current.data);
                
                if (current.left != null) {
                    queue.offer(current.left);	
                }
                if (current.right != null) {
                    queue.offer(current.right);
                }
            }
            wraplist.add(sublist);
        }
        
        return wraplist;
    }
}

public class levelorder {
    public static void main(String[] args) {
        node root = new node(1);
        root.left = new node(2);
        root.right = new node(3);
        root.left.left = new node(4);
        root.left.right = new node(5);

       solution sol = new solution();
        List<List<Integer>> result = sol.levelorder(root);
        System.out.println("Level order traversal:");
        for (List<Integer> level : result) {
            System.out.print(level+" ");
        }
    }
}
