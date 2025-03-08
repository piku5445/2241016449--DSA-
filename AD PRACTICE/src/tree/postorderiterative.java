package tree;
import java.util.*;
class node5{
	node5 left;
	node5 right;
	int data;
	public node5( int data) {
		
		left = right=null;
		this.data = data;
	}
	
}

public class postorderiterative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		node5 root = new node5(1);
        root.left = new node5(2);
        root.right = new node5(7);
        root.left.left = new node5(3);
      
        root.left.right = new node5(6);
        // Get the in-order traversal
        List<Integer> postorder = traversal(root);

        // Print the in-order traversal
        System.out.println("postorder Traversal:");
        for (int num : postorder) {
            System.out.print(num + " ");
        }

	}
public static List<Integer> traversal(node5 root){
//	   Stack<TreeNode<Integer>> s1=new Stack<>();
//		Stack<TreeNode<Integer>> s2=new Stack<>();
//		List<Integer> postorder=new LinkedList<>();
//		if(root==null) {
//			return postorder;
//		}
//		s1.push(root);
//		while(!s1.isEmpty()) {
//	        TreeNode<Integer> current = s1.pop();
//	            s2.push(current);
//			
//			if(current.left!=null) {
//				s1.push(current.left);
//				
//			}
//			if(current.right!=null) {
//				s1.push(current.right);
//			}
//		}
//			while(!s2.isEmpty()) {
//				postorder.add(s2.peek().data);
//				s2.pop();
//			}
//			return postorder;
	
	
	
//	Stack<node5> s=new Stack<>();
//	List<Integer> postorder=new LinkedList<>();
//	if(root==null) {
//		return postorder;
//	}
//	s.push(root);
//	while(!s.isEmpty()) {
//		node5 num=s.peek();
//		
//		if(num.right!=null) {
//		s.push(num.right);	
//		}
//		if(num.left!=null) {
//			s.push(num.left);
//		}
//        num=s.pop();
//		postorder.add(num.data);
//		
//		}
//	return postorder;
	//left right root
	Stack<node5> s1=new Stack<>();
	Stack<node5> s2=new Stack<>();
	List<Integer> postorder=new LinkedList<>();
	if(root==null) {
		return postorder;
	}
	s1.push(root);
	while(!s1.isEmpty()) {
		root=s1.peek();
		s1.pop();
		s2.push(root);
		if(root.left!=null) {
			s1.push(root.left);
			
		}
		if(root.right!=null) {
			s1.push(root.right);
		}
	}
		while(!s2.isEmpty()) {
			postorder.add(s2.peek().data);
			s2.pop();
		}
		return postorder;
	
}
}
