import java.util.Scanner;
class link{
	int info;
	link next;
	
}
public class DP1 {
	static link top=new link();
	static Scanner sc=new Scanner(System.in);
	public static void push() {
	 
	 top=null;
	 link temp=new link();
	 System.out.println("enter the value of node ");
	 temp.info=sc.nextInt();
	 temp.next=null;
	 temp.next=top;
	 top=temp; 
	}
	public static void display() {
		if(top==null) {
			System.out.println("under flow condition");
		}
		else {
			link t=top;
			while(t!=null) {
				System.out.println(t.info+" ");
				t=t.next;
			}
			
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
push();
push();
push();
push();
push();

display();
display();
display();

	}

}
