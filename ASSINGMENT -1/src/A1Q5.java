import java.util.Scanner;
public class A1Q5 {
public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int n= sc.nextInt();
	int sum=0;
	
	while(n>0) {
		int r=n%10;
		
		sum=sum+r;
		
		n=n/10;
		
	} 
	if(sum>10) {
		System.out.println("the number is more than one  digit");
	}
	else {
		System.out.println("it is one digit");
	}
	
}
}
