import java.util.Scanner;


class link{
	int info;
	link next;
}
 
	
public class LK1 {
	static link start =null;
	public static   void create(link node){
	Scanner sc=new Scanner(System.in);	
		System.out.println("enter the information from nodes"); 
		node.info=sc.nextInt();
		node.next=null;
		int x=sc.nextInt();
		while(x!=0) {
			link curr=new link();
			System.out.println("print the info from 0 to 1");
			curr.info=sc.nextInt();
			curr.next=null;
			node.next=curr;
			node=curr;
			System.out.println("enter the values from 0 to 1");
			x=sc.nextInt();
		}}
			
	public static void sort(link node) {
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
	public static void display(link node) {
		while(node!=null) {
			System.out.println(node.info+" ");
			node=node.next;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub'
		link node=new link();
		start=node;
create(start);
sort(start);
display(start);

	}

}
