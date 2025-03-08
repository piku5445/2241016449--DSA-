import java.util.Scanner;
import java.util.Arrays;
public class merge_sorted_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the numner of array in A");
		int a=sc.nextInt();
		System.out.println("enter the number of elements in B");
		int b=sc.nextInt();
        int ar1[]=new int[a];
        int ar2[]=new int[b];
        int ar3[]=new int [a+b];
        System.out.println("enter the array1");
        for(int i=0;i<ar1.length;i++) {
        	ar1[i]=sc.nextInt();
        	
        }
        System.out.println("enter the array2");
        for(int j=0;j<ar2.length;j++) {
        	ar2[j]=sc.nextInt()
;
        	}
        Arrays.sort(ar1);
        Arrays.sort(ar2);
        int i=0;
        int j=0;
        int k=0;
        
        while(i<a&&j<b) {
        	if(ar1[i]<ar2[j]) {
        		ar3[k]=ar1[i];
        		i++;
        		
        	}
        	
        	else {
        		ar3[k]=ar2[j];
        	j++; 
        	
        }
        	k++;
        	}
        while(j<b) {
        	ar3[k]=ar2[j];
        	k++;
        	j++;
        	
        }
        while(i<a) {
        	ar3[k]=ar1[i];
        	i++;
        	k++;
        	
        }
System.out.println("the merged sorted array will be");
for(i=0;i<ar3.length;i++) {
	System.out.println(ar3[i]);
}
	}
}
