import java.util.Scanner;
public class A1Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
System.out.println("enter the number");
int n= sc.nextInt();
int sum=0;
int multi=1;
while(n>0) {
	int r= n%10;
	sum=sum+r;
	multi=multi*r;
	n=n/10;
}
System.out.println("the sum is "+ sum + " the multi is "+ multi);
if(sum==multi) {
	System.out.println("it is a spy number ");
}
else {
	System.out.println("it is not a spy number");
}
	}

}
