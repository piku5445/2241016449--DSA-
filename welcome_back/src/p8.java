import java.util.Scanner;
public class p8 {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the numbers of element ");
int n=sc.nextInt();
int a=0;
int b=1;
int i=0;
while(i<n/2) {
	i++;
	System.out.println(a+" "+b);
	a=a+b;
	b=a+b;
}
if(n%2!=0) {
	System.out.println(a);
}

	}

}
