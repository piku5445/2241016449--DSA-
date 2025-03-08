import java.util.*;
public class twosum1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[]= {2,6,5,8,11};
		System.out.println("the particular elemnt is "+sum(ar,14));

	}
	public static String  sum(int ar[],int target) {
	HashMap<Integer,Integer> set=new HashMap<>();
	for(int i=0;i<ar.length;i++) {
		int num=ar[i];
		int remain=target-num;
		if(set.containsKey(remain)) {
			return "Present";
		}
		set.put(ar[i],i);
	
	}
	return "not Present";
	}

}
