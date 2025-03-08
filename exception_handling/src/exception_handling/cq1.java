
package exception_handling;
import java.util.Scanner;
class aq {
	
}
public class cq1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
try {
	int z=a/b;
	System.out.println(z);
}
catch(ArithmeticException e){
	e.printStackTrace();
}

	}

}
