import java.util.*;

public class consecutivenumbers2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int[] a = {100, 200, 1, 2, 3, 4};
		  System.out.println(optimal1(a));

	}
	public static int optimal1(int ar[]) {
	int 	n=ar.length;
		if(n==0) {
			return 0;
			
		}
		Arrays.sort(ar);
		int longest=1;
		int count=0;
		int lastsmaller=Integer.MIN_VALUE;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]-1==lastsmaller) {
				count++;
				lastsmaller=ar[i];
				
			}
			else if(ar[i]!=lastsmaller) {
				count++;
				lastsmaller=ar[i];
				
			}
			longest=Math.max(longest, count);
		}
		return longest;
		
	}

}
