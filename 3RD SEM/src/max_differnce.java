import java.util.Scanner;

public class max_differnce {

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
		int max=ar[0];
		int min=ar[0];
		for(int i=0;i<ar.length;i++) {
			if(ar[i]>max) {
				max=ar[i];
			}
			if(ar[i]<min) {
				min=ar[i];
			}
		}
		int dif=max-min;
	System.out.println("the maximum difference will be "+dif);
	}

}
