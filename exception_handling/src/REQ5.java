import java.util.Scanner;
public class REQ5 {
	static Scanner sc=new Scanner(System.in);


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the number =");
		int n=sc.nextInt();
	rev(n);
	}
	public static void rev(int n) {
		if(n==0) {
			return;
			
		}
		else
			System.out.println(n);
			rev(n-1);
		
	}

}
