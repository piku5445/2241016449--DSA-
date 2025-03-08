
import java.util.Scanner;
class node1{
	int info;
	node1 next;
}
public class LKQ7 {
	 static Scanner sc=new Scanner(System.in);
		static node1 start=null;
		public static void create(node1 link){
			
		System.out.println("enter the value of node ");	
	     
	     link.info=sc.nextInt();
	     link.next=null;
	     System.out.println("enter the 0 to exist or any other key of the to continue");
	     int x=sc.nextInt();
	     while(x!=0) {
	    	 node1 curr=new node1();
	    	 System.out.println("enter the value of current node");
	    	 curr.info=sc.nextInt();
	    	 curr.next=null;
	    	 link.next=curr;
	    	 link=curr;
	    	 System.out.println("enter the 0 to exist or any other key to continue ");
	   	 x=sc.nextInt();
	    	 
	     }
	     

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
