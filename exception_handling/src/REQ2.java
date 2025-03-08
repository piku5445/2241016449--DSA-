import java.util.Scanner;
public class REQ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
System.out.println("enter the number");
System.out.println(fact(n));
	}
	public static int fact(int n) {
		if(n==1) {
			return 1;
		}
		else 
			
		return (n*fact(n-1));
	}

}
