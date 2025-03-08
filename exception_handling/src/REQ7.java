import java.util.Scanner;

public class REQ7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
rev(n);
	}
public static void rev(int n) {
	if(n==1) {
		System.out.println(1);
		
	}
	else {
		System.out.println(n);
		rev(n-1);
		
	}
}
}
