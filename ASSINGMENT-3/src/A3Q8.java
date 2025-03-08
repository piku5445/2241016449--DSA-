import java.util.Scanner;
public class A3Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the number to be reversed");
		int n=sc.nextInt();
		int sum=0;
	System.out.println(	rev(n,sum));

	}
public static int rev(int n,int sum) {
	if(n==0) {
	return sum;	
	}
	else
		return rev((n/10), (sum*10+n%10));
}
}
