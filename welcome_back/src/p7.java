import java.util.*;

public class p7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int multi=1;
for(int i=1;i<=n;i++) {
	 multi=multi*i;
}
System.out.println("the factorial of the number is "+multi);
	}

}
