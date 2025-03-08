import java.util.*;
public class bslowerbound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int[] arr = {1,2,3,3,5,8,8,10,10,11};
	        int n = 6, x = 9;
	        int ind = bs1(arr, x, 0,n-1);
	        System.out.println("The lower bound is the index: " + ind+" "+ arr[ind]);

	}
public static int bs1(int ar[],int target,int l,int h) {
//	int ans=target;
//	int n=ar.length;
//	int mid=(l+h)/2;
//	if(ar[mid]<target) {
//		bs1(ar,ans,mid+1,h);
//	}
//		else {
//		bs1(ar,ar[mid],l,mid-1);
//		}
//	return target;
//	}
		
		int low=0;
		int ans=ar.length;
		int high=ar.length-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(ar[mid]>=target) {
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


