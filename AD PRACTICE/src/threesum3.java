import java.util.*;
public class threesum3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {-1, 0, 1, 2, -1, -4 };
        int n = arr.length;
        List<List<Integer>> ans = optimal(arr);
       for(int i=0;i<ans.size();i++) {
    	   List<Integer> it=ans.get(i);
    	   System.out.print("[");
    	   for(int j=0;j<it.size();j++) {
    		   Integer element=it.get(j);
    		   System.out.print(element+" ");
    	   }
    	   System.out.print("]");

       }
	
	}
	public static List<List<Integer>> optimal(int ar[]) {
		List<List<Integer>> list=new ArrayList<>();
		Arrays.sort(ar);
		for(int i=0;i<ar.length;i++) {
			 if (i != 0 && ar[i] == ar[i - 1]) continue;

			int j=i+1;
			int k=ar.length-1;
			while(j<k) {
				int taget=-(ar[i]+ar[j]);
				if(ar[i]+ar[j]+ar[k]<0) {
					j++;
				}
				else if(ar[i]+ar[j]+ar[k]>0) {
					k--;
				}
				else{
				List<Integer> ans=Arrays.asList(ar[i],ar[j],ar[k]);
				list.add(ans);
				j++;
				k--;
				 while (j < k && ar[j] == ar[j - 1]) j++;
                 while (j < k && ar[k] == ar[k + 1]) k--;
				}
			}
		}
		return list;
}}
