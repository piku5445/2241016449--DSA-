import java.util.*;

public class consecutivenumbers3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []ar={100, 200, 1, 2, 3, 4};
System.out.println(optimal2(ar));
	}
	public static int optimal2(int [] ar) {
		int n=ar.length;
		if(n==0) {
			return 0;
		}
		int longest =1;
		Set<Integer> set= new HashSet<>();
		for(int i=0;i<n;i++) {
			set.add(ar[i]);
		}
		for(int it:set) {
			if(!set.contains(it-1)) {
				int count=1;
				int x=it;
			while(set.contains(x+1)) {
				x=x+1;
				count=count+1;
			}
			longest=Math.max(longest, count);
			}
		}
		return longest;
	}

}
