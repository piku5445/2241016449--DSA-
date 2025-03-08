import java.util.Scanner;

public class REQ4 {
	public static void PI(int n) {
		if(n==1) {
			System.out.print(n);
			return;
		}
		else {
			PI(n-1);
		System.out.print(n);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
PI(n);

	}

}
