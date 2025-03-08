package q;
import java.util.Scanner;
class link{
	link next;
	int info;
	
}
public class DP4 {
	static Scanner sc=new Scanner(System.in);
	
static link front =null;
static link rear=null;
public static void insert() {
	link temp=new link();
	temp.info=sc.nextInt();
	temp.next=null;
if(front==null&&rear==null) {
	front=temp;
	rear=temp;
	
}
		rear=rear.next;
		rear=temp;
}
public static void del() {
	if(front==null&&rear==null) {
		System.out.println("under flow condition ");
	}
	else if(front==rear) {
		front=null;
		rear=null;
		
	}
	else {
		front=front.next;
	}
		
}
public static void display() {
	if(front==null&&rear==null) {
		System.out.println("under flow condition");
	}
	else {
	link t=front;
	while(t!=null) {
		System.out.println(t.info+" ");
		t=t.next;
	}
	}
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		insert()
;
		insert();
		insert();
		insert();
		display();
		del();
		
		
		}

}
