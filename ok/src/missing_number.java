import java.util.Scanner;
public class missing_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the numner of array in A");
		int n=sc.nextInt();
		
        int ar[]=new int[n];
       int []ar2=new int[n];
        		
        System.out.println("enter the array1");
        for(int i=0;i<n-1;i++) {
        	ar[i]=sc.nextInt();
        	
        }
        
        for(int i=0;i<n+1;i++) {
       ar[i]=0;
      
        }
        for(int i=0;i<n+1;i++) {
        ar2[ar2[i]]=1;
        }
        for(int i=0;i<n;i++) {
        	if(ar2[i]==0) {
        		System.out.println("the missing element is at index "+i);
        	}
        }
	}

}
