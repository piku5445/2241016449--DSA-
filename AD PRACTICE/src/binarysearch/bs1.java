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
public class bs1 {
		Node root;
		bs1(){
			root=null;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bs1 bst=new bs1();
		bst.root = bst.insert(bst.root, 50);
        bst.root = bst.insert(bst.root, 30);
        bst.root = bst.insert(bst.root, 20);
        bst.root = bst.insert(bst.root, 40);
        bst.root = bst.insert(bst.root, 70);
        bst.root = bst.insert(bst.root, 60);
        bst.root = bst.insert(bst.root, 80);

	}
Node insert(Node root,int key) {
	if(root==null) {
		return new Node(key);
	}
	if(root.data>key) {
		root.left=insert(root.left,key);
	}
else if(root.data>key){
	root.right=insert(root.right,key);
}
	return root;
}
}
