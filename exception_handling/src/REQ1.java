


import java.util.Scanner;
public class REQ1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the base");
		int m=sc.nextInt();
		System.out.println("enter the power");
		int n=sc.nextInt();
		
		System.out.println("The "+m+" to the power "+n+" is "+power(m,n));
	}
	public static int power(int m,int n) {
		if(n==0) 
			return 1;
			
		else
			return(m*power(m,n-1));
		
	}

}
