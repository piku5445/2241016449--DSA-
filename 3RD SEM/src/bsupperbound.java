import java.util.*;
public class bsupperbound {

	public static void main(String[] args) { int[] arr = {3, 5, 8, 9, 15, 19};
    int n = 6, x = 9;
    int ind = bs2(arr, x, 0,n);
    System.out.println("The lower bound is the index: " + ind+" "+ arr[ind]);

}
	public static int bs2(int ar[],int target,int low,int high) {
		int ans=ar.length;
		
		while(low<=high) {
			int mid=(low+high)/2;
			if(ar[mid]>target) {
				ans=mid;
				
				high=mid-1;
			
			}
			else {
				low=mid+1;
				
			}
		}
		return ans;
	}

}
