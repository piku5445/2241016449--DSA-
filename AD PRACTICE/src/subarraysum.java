import java.util.*;
public class subarraysum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[]={9, -3, 3, -1, 6, -5};
		System.out.println(brute(ar));
	}
public static List<List<Integer>> brute(int[] ar){
	List<List<Integer>> result=new ArrayList<>();
	for(int i=0;i<ar.length;i++) {
		int sum=0;
		for(int j=i;j<ar.length;j++) {
			sum=sum+ar[j];
			if(sum==0) {
				List<Integer> ans= Arrays.asList(ar[i],ar[j]);
				result.add(ans);
			}
			
		}
		
	}
	return result;
}
}
