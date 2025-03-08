import java.util.*;
class link1{
	int info;
	link1 next;
	
}
class link2{
		String info;
		link2 next;
}
 class listnode{
	int info;
	listnode next;
}
	
public class P14 {
	static Scanner sc=new Scanner(System.in);
	static link1 head =null;
	static link2 head2=null;
	public static void create(link1 node1) {
		System.out.println("enter the value of node ");
		node1.info=sc.nextInt();
		node1.next=null;
		System.out.println("enter the key 0 to exit and any other key to continue");
		int x=sc.nextInt();
		while(x!=0) {
			link1 curr=new link1();
			curr.info=sc.nextInt();
			curr.next=null;
			node1.next=curr;
			node1=curr;
			System.out.println("enter the key 0 to exit or any any other key to continue");
			x=sc.nextInt();
		}
		
	
	}
	public static void display(link1 node ) {
		while(node!=null) {
			System.out.println(node.info+" ");
			node=node.next;
			
		}
	}
	public static void create2(link2 node2) {
		System.out.println("enter the value of node ");
		node2.info=sc.next();
		node2.next=null;
		System.out.println("enter the key 0 to exit and any other key to continue");
		int x=sc.nextInt();
		while(x!=0) {
			link2 curr=new link2();
			curr.info=sc.next();
			curr.next=null;
			node2.next=curr;
			node2=curr;
			System.out.println("enter the key 0 to exit or any any other key to continue");
			x=sc.nextInt();
		}}
	public static void display2(link2 node2 ) {
		while(node2!=null) {
			System.out.println(node2.info+" ");
			node2=node2.next;
			
		}
	}
	public listnode mergeTwoLists(listnode link, listnode node2) {
		while(link!=null) {
			
			
		}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
