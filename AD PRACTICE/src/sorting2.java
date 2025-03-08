import java.util.*;
public class sorting2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int ar[]= {2,2,3,3,1,2,2};
System.out.println(majorityelement(ar));
	}
	public static int majorityelement(int ar[]) {
		HashMap<Integer,Integer> set=new HashMap<>();
		int n=ar.length;
		for(int i=0;i<ar.length;i++) {
			int val=set.getOrDefault(ar[i], 0);
			set.put(ar[i],val+1);
		}
		for(Map.Entry<Integer,Integer> it:set.entrySet() ) {
			if(it.getValue()>n/2) {
				return it.getKey();
			}
		}
		return -1;

	}

}
//Time Complexity of the algorithm is O(NlogN)+O(n)
//space complexity of the algorithm is O(N)
