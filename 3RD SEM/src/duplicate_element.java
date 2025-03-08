import java.util.Scanner;

public class duplicate_element {

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
        for( i=1;i<n;i++) {
        	ar[i]=sc.nextInt();
        	if(ar[i]>max) {
        		max=ar[i];
        		
        	}
           
        }
         int b[]=new int[max];
        
        int flag=0;
        for(int j=1;j<max;j++) {
            b[ar[i]]++;

        	if(b[ar[i]]>1) {
        		flag++;
        		
        	}
        	
        }
        if(flag>1) {
        	System.out.println("the element is getting repeated of index"+i+"the element is"+ar[i]);
        }
	}

}
