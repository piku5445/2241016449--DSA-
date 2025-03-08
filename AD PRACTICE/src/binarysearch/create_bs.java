package binarysearch;
class Node{
	Node left;
	Node right;
	int data;
	Node(int data){
		this.data=data;
		left=right=null;
	}
}
public class create_bs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root=new Node();
System.out.println(search());
	}
boolean search(Node root,int x) {
	if(root==null) {
		return false;
		
	}
	if(root.data==x) {
		return true;
	}
	if(root.data>x) {
		return search(root.left,x);
	}
	return search(root.right,x);
}
}
