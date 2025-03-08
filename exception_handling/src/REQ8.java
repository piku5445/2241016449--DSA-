import java.util.Scanner;

public class REQ8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
printsum(1,n,0);
	}
public static void printsum(int i ,int n ,int sum) {
	
	if(i==n) {
		sum=sum+i;
		System.out.println(sum);
		return;

	}
	
	else{
		
		sum=sum+i;
		printsum(i+1,n,sum);
		
	}
}
}



