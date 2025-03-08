package welcome_back;
import java.util.Scanner;

public class a1q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the array");
		int n=sc.nextInt();
		int []ar=new int[n];
			System.out.println("enter the element of array ");
		for(int i=0;i<ar.length;i++) {
			ar[i]=sc.nextInt();
		}
		int j;
		int k=ar.length;
		for(int i=0;i<k+1;i++) {
			for( j=0;j<k;j++) {
				if(ar[i]==i) {
					break;
				}
			}
			if(j==k) {
				System.out.println("the missing elemnet is "+i);
				break;
			}
		}
		

	}

}
