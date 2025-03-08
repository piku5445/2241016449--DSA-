import java.util.*;
public class threesum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {13,-18, -1 ,-44, -48, -9, -16, -36, -13, 29, 17 ,-12, 9, -49 };
        int n = arr.length;
        List<List<Integer>> ans = better(arr);
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
public static List<List<Integer>>  better(int ar[]) {
	ArrayList<Integer> ans=new ArrayList<>();
	Set<List<Integer>> st = new HashSet<>();
	int sum=0;
	for(int i=0;i<ar.length;i++) {
		Set<Integer> hashset = new HashSet<>();
		
		for(int j=i+1;j<ar.length;j++) {
			int third=-(ar[i]+ar[j]);
			if(hashset.contains(third)) {
				List<Integer> temp=Arrays.asList(ar[i],ar[j],third);
				temp.sort(null);
				st.add(temp);
			}
			hashset.add(ar[j]);
		}}
	List<List<Integer>> result=new ArrayList<>(st);
	return result;
	
}
}
