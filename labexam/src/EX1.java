import java.util.*;
class node{
	node next;
	int info;
	public static node next() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
public class EX1 {
	static Scanner sc=new Scanner(System.in);
	static node start =null;
	public static void create(node link) {
		link.next=null;
		link.info=sc.nextInt()
;
		System.out.println("enter the number to contionue else 0 to exit");
		int x=sc.nextInt();
		
		while(x!=0) {
	node curr=new node();
	
curr.info=sc.nextInt();
link.next=curr;
curr.next=null;
link=curr;
x=sc.nextInt();


}
		}
	public static void inbeg(node link) {
		node temp=new node();
		
		System.out.println("enter the info of link");
		temp.info=sc.nextInt();
		temp.next=link;
		start=temp;
		
	}
	public static void inend(node link) {
		node temp=new node();
		
				System.out.println("enter the info");
				while(link.next!=null) {
					link=link.next;
					
				}
				link.next=temp;
				temp.next=null;
	}
	public static void inany(node link,int pos) {
		int i=0
;
		
		node temp=new node();
		temp.info=sc.nextInt();
		node prev=new node();
		while(i<pos) {
			prev=link;
			temp=temp.next;
			i++;
		}
		prev.next=temp;
		temp.next=link;
		
		
		}
	public static void delany(node link,int pos) {
		int i=0;
		node prev=new node();
		while(i<pos) {
	prev=link;
link=link.next;
i++;
		
		}
		prev.next=link.next;
	}
public static void display(node link) {
	while(link!=null) {
			System.out.println(link.info);
		link=link.next;
	
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
