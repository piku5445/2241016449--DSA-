import java.util.Scanner;
public class DP3 {
	static Scanner sc=new Scanner(System.in);
	
	 int ar[];
	final   int max=sc.nextInt();
	int top=-1;
	DP3(){
		ar=new int[max];
		
	}
	void push(int x) {
		if(top== max-1) {
		System.out.println("over flow condition");
		}
		else {
			top++;
			ar[top]=x;
		}
	}
void display() {
	
	for(int i=top;i>=0;i--) {
		System.out.println(ar[i]+" ");
	}
}
void pop() {
	if(top==-1) {
		System.out.println("under flow condition");
	}
	else {
		
		top--;
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DP3 a=new DP3();
a.push(3);
a.push(8);
a.push(0);
// a.push(5);
a.display();
System.out.println( );
a.pop();
	}

}
