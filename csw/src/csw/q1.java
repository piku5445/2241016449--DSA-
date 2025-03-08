package csw;
import java.util.Scanner;
public class q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int count =0;
		while(n>0) {
			if((n&1)==1) {
				count++;
			}
			n=n>>1;
		}
System.out.println(count);
	}
}
