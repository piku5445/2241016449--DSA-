package tree;
import java.util.*;

class node0 {
    int data;
    node0 left;
    node0 right;

    node0(int val) {
        data = val;
        left = null;
        right = null;
    }
}

class Pair<K, V> {
    K key;
    V value;

    Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}

public class allinone {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        node0 root = new node0(1);
        root.left = new node0(2);
        root.right = new node0(3);
        root.left.left = new node0(4);
        root.left.right = new node0(5);
        List<Integer> pre, in, post;
        List<List<Integer>> traversals = preinpost(root);
        pre = traversals.get(0);
        in = traversals.get(1);
        post = traversals.get(2);
        System.out.println("Preorder traversal: ");
        printList(pre);
        System.out.println("Inorder traversal: ");
        printList(in);
        System.out.println("Postorder traversal: ");
        printList(post);
    }

    public static List<List<Integer>> preinpost(node0 root) {
        List<Integer> pre = new ArrayList<>();
        List<Integer> in = new ArrayList<>();
        List<Integer> post = new ArrayList<>();
        if (root == null) {
            return new ArrayList<>();
        }
        Stack<Pair<node0, Integer>> st = new Stack<>();
        st.push(new Pair<>(root, 1));
        while (!st.empty()) {
            Pair<node0, Integer> it = st.pop();
            if (it.getValue() == 1) {
                pre.add(it.getKey().data);
                it.setValue(2);
                st.push(it);
                if (it.getKey().left != null) {
                    st.push(new Pair<>(it.getKey().left, 1));
                }
            } else if (it.getValue() == 2) {
                in.add(it.getKey().data);
                it.setValue(3);
                st.push(it);
                if (it.getKey().right != null) {
                    st.push(new Pair<>(it.getKey().right, 1));
                }
            } else {
                post.add(it.getKey().data);
            }
        }
        List<List<Integer>> result = new ArrayList<>();
        result.add(pre);
        result.add(in);
        result.add(post);
        return result;
    }

    public static void printList(List<Integer> list) {
        for (int num : list) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
