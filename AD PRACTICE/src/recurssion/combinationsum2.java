package recurssion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//import java.util.Set;

	
public class combinationsum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[] = {10,1,2,7,6,1,5};
	     
	        
	        List < List < Integer >> comb = combination(arr, 8);
	        System.out.println("Combinations are: ");
	        System.out.println(comb.toString().replace(",", " "));
	   
	        }

	
	public static void first( int ind ,int ar[],int target,List<List<Integer>> ans,List<Integer> l){
		//ArrayList<Integer> l=new ArrayList<>();
		
			if(target==0) {
				ans.add(new ArrayList<>(l));
				return;
			
		}
		for(int i=ind;i<ar.length;i++) {
			if(i>ind&&ar[i]==ar[i-1])
				
				continue;
			if(ar[i]>target)
				break;
			l.add(ar[i]);
			first(i+1,ar,target-ar[i],ans,l);
			l.remove(l.size()-1);
			
		}
		
	}
	
	public static List<List<Integer>> combination(int[]candinate,int target ){
		List<List<Integer>> ans=new ArrayList<>();
		Arrays.sort(candinate);
		first(0,candinate,target,ans,new ArrayList<>());
		return ans;
	}

}
