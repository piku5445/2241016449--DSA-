import java.util.Scanner;
public class P7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the number of ");
		int n=sc.nextInt();
		
		String arr[] = new String[n];
		int arr1[]=new int[n];
		 for(int i=0;i<n;i++) {
			 arr[i]=sc.next();	
			 arr1[i]=sc.nextInt();
		 }
	/// String ele="piku";
	///	 int res=count(arr,ele,n);
	///	 System.out.println(res);
		 
		 
		 int p=1;
		 int res1=count(arr1,7,n);
		 System.out.println(res1);
		 
		 

	}
	
	

	public static <T> int count(T[]ar,T ele,int n){
		int count =0;
		for(int i=0;i<n;i++)
		if(ar[i].equals(ele)) {
			count++;
		}
		return count;
	}

}
