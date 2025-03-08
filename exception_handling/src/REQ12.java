import java.util.Scanner;

public class REQ12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number to get power");
int n=sc.nextInt();
System.out.println(pow(n));
	}

	public static int pow(int n) {
		// TODO Auto-generated method stub
		int pow1;
		if(n==1) {
			return 2;
		}
		else
			n--;
		pow1=pow(n);
		return pow1*2;	
	}

}
