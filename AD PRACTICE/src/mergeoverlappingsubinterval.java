import java.util.*;
public class mergeoverlappingsubinterval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [][]ar ={{1, 3}, {8, 10}, {2, 6}, {15, 18}};
List<List<Integer>> ans=brute(ar);
System.out.println("merged intervals is");
for(List<Integer> it:ans) {
	System.out.print("[ "+ it.get(0)+", "+it.get(1)+"]  ");
}
	}
public static List<List<Integer>> brute(int[][]ar)
{
	
	   Arrays.sort(ar, new Comparator<int[]>() {
           public int compare(int[] a, int[] b) {
               return a[0] - b[0];
           }
       });
	List<List<Integer>> ans=new ArrayList<>();
	for(int i=0;i<ar.length;i++) {
		int start=ar[i][0];
		int end=ar[i][1];
		if(!ans.isEmpty()&&end<=ans.get(ans.size()-1).get(1))
			continue;
		for(int j=i+1;j<ar.length;j++) {
			if(ar[j][0]<=end) {
				end=Math.max(end,ar[j][1]);
				
			}
			else {
				break;
			}
			
		}
		ans.add(Arrays.asList(start,end));
		
	}
	return ans;
}
}
