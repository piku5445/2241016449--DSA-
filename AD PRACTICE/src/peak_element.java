import java.util.*;
public class peak_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Problem Statement: Given an array of length N. Peak element is defined as the element greater than both of its neighbors.
//Peak element is defined as the element greater than both of its neighbors. 
//Formally, if ‘arr[i]’ is the peak element, ‘arr[i – 1]’ < ‘arr[i]’ and ‘arr[i + 1]’ < ‘arr[i]’.
// Find the index(0-based) of a peak element in the array. If there are multiple peak numbers, return the index of any peak number.
		
		//'arr' = [1, 8, 1, 5, 3]
		int arr[]= {1,8,1,5,3};
		System.out.println("the peak element is "+ findPeakElement( arr));
		
		
		
	}
	 public static int findPeakElement(int arr[]) {
	        // Write your code here.
		 int peak1=0;
		 
		 for(int i=0;i<arr.length;i++) {
			  if ((i == 0 || arr[i] > arr[i - 1]) && (i == arr.length - 1 || arr[i] > arr[i + 1])) {
	                peak1++;
	    }
		
}
		return peak1;}}
		
