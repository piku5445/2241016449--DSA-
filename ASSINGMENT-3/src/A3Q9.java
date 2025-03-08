import java.util.Scanner;
public class A3Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the number of series");
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
	else {
		return fibo(n-2)+fibo(n-1);
	}
}
}
