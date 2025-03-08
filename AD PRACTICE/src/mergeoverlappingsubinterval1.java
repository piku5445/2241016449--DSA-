import java.util.*;
public class mergeoverlappingsubinterval1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{1, 3}, {8, 10}, {2, 6}, {15, 18}};
        List<List<Integer>> ans = optimal(arr);
        System.out.print("The merged intervals are: \n");
        for (List<Integer> it : ans) {
            System.out.print("[" + it.get(0) + ", " + it.get(1) + "] ");
        }
        System.out.println();
    
	}
public static List<List<Integer>> optimal(int [][]ar){
	int n=ar.length;
	Arrays.sort(ar,new Comparator<int []>() {
		public int compare(int []a,int []b) {
			return a[0]-b[0];
		}
	});
	List<List<Integer>> ans=new ArrayList<>();
	for(int i=0;i<n;i++) {
		if(ans.isEmpty()||ar[i][0]>ans.get(ans.size()-1).get(1)) {
			ans.add(Arrays.asList(ar[i][0],ar[i][1]));
		}
		else {
			ans.get(ans.size()-1).set(1, Math.max(ans.get(ans.size()-1).get(1), i));
		}
	}
	return ans;
}
}
