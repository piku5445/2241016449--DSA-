import java.util.Scanner;
public class REQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner (System.in);
int n=sc.nextInt();
System.out.println("enter the number to have sum");
System.out.println(sum(n));
	}
public static int  sum(int n) {
	if(n==1) {
		return 1;
	}
	else {
		return(sum((n-1)+n));
	}
}}

