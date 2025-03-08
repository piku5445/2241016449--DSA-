import java .util.Scanner;
class node{
	node left;
	node right;
	int data;
	node(int data){
		this.data=data;
	}
	
}
public class P1 {
	static Scanner sc=new Scanner(System.in);
	public static node createTree() {
		node root=null;
		System.out.println("enter the data ");
		int data=sc.nextInt();
		if(data==-1) {
		}
		else {
			root =new node(data);
			System.out.println("enter the data of left node");
			root.left=createTree();
			System.out.println("enter the data of right node ");
			root .right=createTree();
		}
		return root;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
