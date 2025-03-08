import java.util.*;
public class twosum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[]= {6,11,5,8,9};
		Arrays.sort(ar);
		System.out.println(sum(ar,25));

	}
public static String sum(int ar[],int target) {
	int i=0;
	int sum=0;
	int j=ar.length-1;
	while(i<j) {
	sum=ar[i]+ar[j];
	if(sum==target) {
		return "yes";
		
	}
	else if(sum<target) {
		i++;
	}
	else
		j--;
	}
	return "no";
}

}
