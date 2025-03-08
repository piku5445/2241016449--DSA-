import java.util.Scanner;

public class p17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of element");
		int n=sc.nextInt();
		int []ar=new int[n];
		System.out.println("enter the array");
		for(int i=0;i<ar.length;i++) {
			ar[i]=sc.nextInt();
		}
		for(int i=0;i<ar.length-1;i++) {
			int min=i;{
				for(int j=i+1;j<ar.length;j++) {
					if(ar[min]>ar[j]) {
						min=j;					}
				}		
				int temp = ar[min];
		        ar[min] = ar[i];
		        ar[i] = temp;	    		
			}
			}
		for(int i=0;i<ar.length;i++) {
			System.out.println("the selection sort of the given array will be "+ar[i]);
		}
	}
}