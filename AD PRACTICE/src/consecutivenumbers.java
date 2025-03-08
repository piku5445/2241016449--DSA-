import java.util.*;

public class consecutivenumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[]= {100, 200, 1, 3, 2, 4};
		System.out.println(brute(ar));

	}
public static  int brute(int [] ar){
	ArrayList<Integer> ans=new ArrayList<>();
	int max=0;
	
	for(int i=0;i<ar.length;i++) {
		int count=1;
		int temp=ar[i];
		int j=0;
	while(contains(ar,temp+1)) {
		count++;
		temp++;
	}
	max=Math.max(max, count);
	
	;}
	return max>1? max:-1;
}
public static boolean contains(int[] ar, int num) {
	for(int i=0;i<ar.length;i++) {
		if(ar[i]==num) {
			return true;
		}
	}
	return false;
}}
