import java.util.Scanner;
class link5{
	int info;
	link5 next;
	
}
public class stack1 {
static link5 top =null;
public static void push() {
Scanner sc=new Scanner(System.in);
link5 temp=new link5();
System.out.println("enter the value of the link node ");
temp.info=sc.nextInt();
temp.next=top;
top=temp;


}
public static void pop() {
	if(top==null) {
		System.out.println("under flow condition ");
	}
	else {
		top=top.next;
	}
}
public static void  display() {
	if(top==null) {
		System.out.println("under flow condition ");
	}
	else {
		link5 t=top;
		while(t!=null) {
			System.out.println(t.info+" ");
			t=t.next;
		}
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
push();// last in first out
push();
push();
pop();
display();
	
}
			}
		