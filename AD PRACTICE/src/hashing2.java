import java.util.*;
public class hashing2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//union of two arrays
		int a[]= {12,45,12,34};
		int b[]= {12,34,76,32};
		System.out.println(union(a,b));
		

}
	public static int  union(int a[],int b[]) {
		HashSet<Integer> set=new HashSet<>();
		for(int x:a) {
			set.add(x);
		}
		for(int x:b) {
			set.add(x);
		}
		return set.size();
}
}