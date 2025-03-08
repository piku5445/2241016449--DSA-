package recurssion;
import java.util.*;
class Solution{
	public static void first( int i ,int ar[],int target,List<List<Integer>> ans,List<Integer> l){
		//ArrayList<Integer> l=new ArrayList<>();
		if(i==ar.length) {
			if(target==0) {
				ans.add(new ArrayList<>(l));
			}
		}
		else {
			if(ar[i]<=target) {
				l.add(ar[i]);
				 first(i,ar,target-ar[i],ans,l);
				 l.remove(l.size()-1);
			}
				first(i+1,ar,target,ans,l);	
		}
	}
	public List<List<Integer>> combination(int []c,int target){
		List<List<Integer>> ans=new ArrayList<>();
		first(0,c,target,ans,new ArrayList<>());
		return ans;
	}
	public static List<List<Integer>> combinationSum(int[]candinate ,int target){
		List<List<Integer>> ans=new ArrayList<>();
		first(0,candinate,target,ans,new ArrayList<>());
		return ans;
	}
}
public class combinationsum1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[] = {2,3,6,7};
	        int target = 7;
	        Solution sol = new Solution();
	        List < List < Integer >> ls = sol.combination(arr, target);
	        System.out.println("Combinations are: ");
	        for (int i = 0; i < ls.size(); i++) {
	            for (int j = 0; j < ls.get(i).size(); j++) {
	                System.out.print(ls.get(i).get(j) + " ");
	            }
	            System.out.println();
	        }

	}

}
