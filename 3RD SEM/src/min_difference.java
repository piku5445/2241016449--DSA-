import java.util.Scanner;
import java.util.Arrays;
public class min_difference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the numner of array in A");
		int n=sc.nextInt();

		int ar[]=new int[n];
		System.out.println("enter the array1");
		for(int i=0;i<n;i++) {
			ar[i]=sc.nextInt();
			
		}
		Arrays.sort(ar);
		for(int i=0;i<ar.length;i++) {
			for(int j=i+1;j<ar.length;j++) {
				int dif=ar[i]-ar[j];
				if(dif=0) {
					
				}
			}
		}
	}

}
