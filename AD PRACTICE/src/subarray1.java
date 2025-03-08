
public class subarray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int ar[] = {-2, -3, 4, -1, -2, 1, 5, -3};
	        System.out.println(brute(ar));
	}
public static int brute(int ar[]) {
	int max=Integer.MIN_VALUE;
	for(int i=0;i<ar.length;i++) {
		int sum=0;
	for(int j=0;j<ar.length;j++) {
		sum=sum+ar[j];
		max=Math.max(sum, max);
	}
	}
	return max;
}
}
