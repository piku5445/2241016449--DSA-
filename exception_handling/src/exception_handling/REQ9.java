package exception_handling;
import java.util.Scanner;
public class REQ9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
		int n=sc.nextInt();
System.out.println(fact(n));
	}
public static int fact(int n) {
	if(n==1) {
		return 1;
	}
	else
		
		return fact(n*(n-1));
}
}
