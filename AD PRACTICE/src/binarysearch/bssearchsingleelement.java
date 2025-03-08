package binarysearch;
import java.util.*;

public class bssearchsingleelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6};
	        int ans = brute(arr,0,arr.length-1);
	        System.out.println("The single element is: " + ans);
	}
public static int brute(int ar[] ,int l,int h) {
	while(l<=h) {
		int mid=l+(h-l)/2;
		
		
		
		if(ar[mid]!=ar[mid+1]&&ar[mid]!=ar[mid-1]) {
			return mid;
		}
		else if(l<mid) {
			h=mid-1;
		}
		else {
			l=mid+1;
		}
	}
	return -1;
}
}
