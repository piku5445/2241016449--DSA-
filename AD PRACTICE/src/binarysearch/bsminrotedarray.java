package binarysearch;
import java.util.*;
public class bsminrotedarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int[] arr = {4, 5, 6, 7, 0, 1, 2, 3};
	        int ans = minimum(arr, 0, arr.length-1);
	        System.out.println("The minimum element is: " + ans );

	}
	public static int minimum(int ar[],int l,int h) {
		int min=Integer.MAX_VALUE;
		
		while(l<=h) {
			int mid=l+(h-l)/2;
			
			if(ar[l]<=ar[mid]) {
				min=Math.min(min, ar[l]);
			
				l=mid+1;
			}
				else {
					min=Math.min(min, ar[mid]);
					h=mid-1;
				}
					
			
			 
	}
		return  min;

}}
