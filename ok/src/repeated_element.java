import java.util.Scanner;
import java.util.Arrays;
public class repeated_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the numner of array in A");
		int n=sc.nextInt();
		
        int ar[]=new int[n];
       
        		
        System.out.println("enter the array1");
        for(int i=0;i<n-1;i++) {
        	ar[i]=sc.nextInt();
        	
        }
        int max=ar[0];
        int i=0;
        for( i=0;i<n-1;i++) {
        	ar[i]=sc.nextInt();
        	if(ar[i]>max) {
        		max=ar[i];
        		
        	}
        }
        int t=i;
        int flag=0;
        for(i=0;i<t;i++) {
        	if(ar[i]>1) {
        		flag++;
        		break;
        	}
        	
        }
        if(flag>1) {
        	System.out.println("the element is getting repeated of index"+i);
        }
	}

}
