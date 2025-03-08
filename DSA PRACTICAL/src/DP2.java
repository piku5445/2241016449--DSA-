import java.util.Scanner;

public class DP2 {
	static Scanner sc=new Scanner(System.in);
	int [] ar;
 int top=-1;
final int max=5;
DP2(){
	ar=new int[max];
}
void push(int x) {
	if(ar[top]== max-1) {
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			DP2 a=new DP2();
	 a.push(23);
	 a.display();
	 
	 
	}

}
