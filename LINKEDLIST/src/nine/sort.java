package nine;
import java.util.Scanner;

class node2{
	int info;
	node2 next;
	
	
}

public class sort {
	
public static void create1(node2 link) {
	
}
	static Scanner sc=new Scanner(System.in);
	static node2 start=null;
	public static void create(node2 link){
		
	System.out.println("enter the value of node ");	
	 
	 link.info=sc.nextInt();
	 link.next=null;
	 System.out.println("enter the 0 to exist or any other key of the to continue");
	 int x=sc.nextInt();
	 while(x!=0) {
		 node2 curr=new node2();
		 System.out.println("enter the value of current node");
		 curr.info=sc.nextInt();
		 curr.next=null;
		 link.next=curr;
		 link=curr;
		
	 } 
	}
	public static void sort( node2 link) {
		link ptr1=new link();
		link ptr2=new link();
		for(ptr1=node;ptr1.next!=null;ptr1=ptr1.next) {
			for(ptr2=ptr1.next;ptr2!=null;ptr2=ptr2.next) {
				if(ptr1.info>ptr2.info) {
					int t=ptr1.info;
					ptr1.info=ptr2.info;
					ptr2.info=t;
				}
			}
		}
		
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		node2 link=new node2();
		start=link;
create1(start);
sort(start);

	}

}
