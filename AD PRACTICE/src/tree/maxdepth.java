package tree;
class node10{
	node10 left;
	node10 right;
	int data;
	node10(int data){
		this.left=left;
		this.right=right;
		this.data=data;
		}
}
public class maxdepth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
node10 root=new node10(1);
root.left=new node10(2);
root.right=new node10(3);
root.right.left=new node10(5);
root.right.left.right=new node10(6);
root.right.left.left=new node10(8);
root.right.left.left.left=new node10(9)
;
int maxdep=maxdepth1(root);
System.out.println("the maimum depth of the tree is"+ " "+ maxdep);
}
public static int maxdepth1(node10 root) {
	if(root==null) {
		return 0;
	}
		else {
			int l=maxdepth1(root.left);
			int r=maxdepth1(root.right);
			
			return 1+Math.max(l, r);
			
		}
	}
}

