import java.util.*;
public class threesum1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {-1,0,1,0};
		System.out.println(brute(nums));
		}
	public static List<List<Integer>> brute(int ar[]){
		ArrayList<Integer> ans=new ArrayList<>();
		Set<List<Integer>> st = new HashSet<>();
		int sum=0;
		for(int i=0;i<ar.length;i++) {
			Set<Integer> hashset = new HashSet<>();
			for(int j=i+1;j<ar.length;j++) {
			for(int k=j+1;k<ar.length;k++) {
					int third=-(ar[i]+ar[j]);
						sum=ar[i]+ar[j]+ar[k];
						if(sum==0) {
							List<Integer> temp=	 Arrays.asList(ar[i],ar[j],ar[k]);
							temp.sort(null);
							st.add(temp);
						
						}

		}
		}}
		List<List<Integer>> result=new ArrayList<>(st);
		return result;
		//[-1,-1,2],[-1,0,1]]

}}