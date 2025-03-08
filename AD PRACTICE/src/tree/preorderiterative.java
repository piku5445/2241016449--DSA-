package tree;
import java.util.*;
class node4{
	node4 left;
	node4 right;
	int data;
	node4(int data){
		left=right=null;
		this.data=data;
			}
}
public class preorderiterative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 node4 root = new node4(1);
	        root.left = new node4(2);
	        root.right = new node4(3);
	        root.left.left = new node4(4);
	        root.left.right = new node4(5);

	        // Get the in-order traversal
	        List<Integer> preorder = traversal(root);

	        // Print the in-order traversal
	        System.out.println("preOrder Traversal:");
	        for (int num : preorder) {
	            System.out.print(num + " ");
	        }

	}
public static List<Integer> traversal(node4 root){

List<Integer> preorder=new LinkedList<>();
Stack<node4> s=new Stack<>();
if(root==null) {
	return preorder;
}
s.push(root);
while(!s.isEmpty()) {
	node4 topnode=s.peek();
	preorder.add(topnode.data);
	s.pop();
	if(topnode.right!=null) {
		s.push(topnode.right);
		
	}
	if(topnode.left!=null) {
		s.push(topnode.left);
	}
}
return preorder;
	
}
//return topnode;
}
