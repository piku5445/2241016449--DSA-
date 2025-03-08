import java.util.Scanner;


public class REQ3 {
	public static void input(int s) {
		Scanner sc=new Scanner(System.in);
		if(s==0) {
			return;
			
		}
		else {
			System.out.println("input string ");
			String n=sc.next();
			input(s=s-1);
			System.out.println(s);
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		 input(3);

	}

}
