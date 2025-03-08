package tree;
import java.util.*;
class node3{
	node3 left;
	node3 right;
	int data;
 node3( int data) {
		
//		
left=right=null;
		this.data = data;
	}
	
	
}
public class inorderiterative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 node3 root = new node3(1);
	        root.left = new node3(2);
	        root.right = new node3(3);
	        root.left.left = new node3(4);
	        root.left.right = new node3(5);

	        // Get the in-order traversal
	        List<Integer> inOrder = traversal(root);

	        // Print the in-order traversal
	        System.out.println("In-Order Traversal:");
	        for (int num : inOrder) {
	            System.out.print(num + " ");
	        }
	}
public static List<Integer> traversal(node3 root){
//	List<Integer> inorder=new ArrayList<>();
//	Stack<node3> stack=new Stack<>();
//	node3 node=root;
//	while(true) {
//		if(node!=null) {
//			stack.push(node);
//			node=node.left;
//		}
//		else 
	//if(stack.isEmpty()) {
//			break;
//		}
//		node=stack.pop();
//		inorder.add(node.data);
//	node=node.right;
//	
//	}
//	return inorder;
	
	//Left Root Right
	  ArrayList < Integer > inOrder = new ArrayList < > ();
      Stack < node3> s = new Stack < > ();
      while (true) {
          if (root != null) {
              s.push(root);
              root = root.left;
          } else {
              if (s.isEmpty()) 
            	  break;
              root = s.peek();
              inOrder.add(root.data);
              s.pop();
              root = root.right;
          }
      }
      return inOrder;
}
}
