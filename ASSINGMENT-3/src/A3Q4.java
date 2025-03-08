
import java.util.Scanner;

public class A3Q4{
	public static void main(String []args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the array element");
	Integer []ar=new Integer[5];
	for(int i=0;i<5;i++) {
		ar[i]=sc.nextInt();
		System.out.println("enter the element that it  contain");
		Array(ar);
		
	}
	Double [] ar1=new Double[5];
for(int i=0;i<5;i++) {
ar1[i]=sc.nextDouble();
			System.out.println("the double array are");
			Array(ar1);
		}
		
	}

	public static <E> void Array(E[]br){
		for(int i=0;i<5;i++) {
			System.out.println(br[i]);
		}
	}
}