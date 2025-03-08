package queue;
import java.util.Scanner;
class link{
	int info;
	link next;
	
}
public class queue {
	static Scanner sc=new Scanner(System.in);
	static link front=null;
	static link rear=null;
	public static void insert(){
		link temp=new link();
		System.out.println("enter the value of temp node ");
		temp.info=sc.nextInt();
		temp.next=null;
		if(front==null&& rear==null) {
			front=temp;
			rear=temp;
				}
		else {
			rear.next=temp;
			rear=temp;
			
		}
		
		
	}
	public static void display() {
		if(front==null&&rear==null) {
			System.out.println("under flow condition");
			
		}
		else {
			link t=front;
			while(t!=null) {
				System.out.println(t.info+"  ");
				t=t.next;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
insert();
display();
insert();
insert();
insert();
display();
	}

}
