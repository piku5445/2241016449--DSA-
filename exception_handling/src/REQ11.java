import java.util.Scanner;

public class REQ11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in)
;
System.out.println("enter the index number");
int n=sc.nextInt();
System.out.println(fibo(n));
}
	public static int fibo(int n) {
		if(n==1) {
			return 0;
			
		}
		else if(n==2) {
			return 1;
			
		}
		else 
			return (fibo(n-1)+fibo(n-2));
	}

}
