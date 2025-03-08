import java.util.Scanner;
public class REQ10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int sum1;
int n=sc.nextInt();
sum1=printsum(n);
System.out.println(sum1);

	}
	public static int printsum(int n) {
		int sum1,sum2;
		if(n==1) {
			return 1;
		}
		else {
		sum1=printsum(n-1);
		sum2=n+sum1;
		return(sum2);
		}
	}
}

