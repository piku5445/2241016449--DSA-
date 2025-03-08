package binarysearch;
import java.util.*;
public class bssearchrotedarray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int ar[]= {7,8,1,2,3,3,3,4,5,6};
		 boolean ans = optimal(ar, 0, ar.length - 1, 3);
	        if (ans == false)
	            System.out.println("Target is not present.");
	        else
	            System.out.println("The index is: " + ans);
	}
public static boolean optimal(int ar[],int l,int h,int target) {
	while(l<=h) {
		int mid=l+(h-l)/2;
		if(ar[mid]==target) {
			return true;
		}
		if (ar[l] == ar[mid] && ar[mid] == ar[h]) {
		l=l+1;
		h=h-1;
		continue;
	}
		if(ar[l]<ar[mid]) {
			if(ar[l]<=target&&target<ar[h]) {
				h=mid-1;
				
			}
			else {
			l=mid+1;
			}
		}
		if(ar[mid]<ar[h]) {
			if(ar[mid]<target&&target<=ar[h]) {
				l=mid+1;
			}
			else {
			h=	mid-1;
			}
		}
}
	return false;
}}
