import java.util.*;
public class Solution {
    public static void nextPermutation(int[] nums) {
        int ind=-1;
        for(int i=nums.length-2;i>0;i--){
            if(nums[i]<nums[i+1]){
                ind=i;
                break;
            }
        }
        if (ind >= 0) {
        for(int i=nums.length-1;i>ind;i--){
            if(nums[i]>nums[ind]){
                swap(nums,i,ind);


            }}
        }
        reverse(nums,ind+1);
    

    }
    public  static void reverse(int[] nums, int start) {
		// TODO Auto-generated method stub
    	int i=start; int j=nums.length-1;
    	while(i<j) {
    		swap(nums,i,j);
    		i++;
    		j--;
    	}
		
	}
    public static void swap(int[] ar,int i,int j) {
    	int temp=0;
    	temp=ar[i];
    	ar[i]=ar[j];
    	ar[j]=temp;
    }
	public static void main(String args[]){
        int ar[]={3,2,1};
       nextPermutation(ar);
         System.out.println(Arrays.toString(ar)); 
    }

}