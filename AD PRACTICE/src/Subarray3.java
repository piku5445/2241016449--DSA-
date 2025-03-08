
public class Subarray3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int ar[] = {-2, -3, 4, -1, -2, 1, 5, -3};
	        System.out.println(kadanes_algo(ar));
	}
public static int kadanes_algo(int ar[]) {
	int max=Integer.MIN_VALUE;
	int sum=0;
	int start=0;
	 int ansStart = -1, ansEnd = -1;
	for(int i=0;i<ar.length;i++) {
		if(sum==0) 
			start=i;
		sum=sum+ar[i];
		if(sum>=max) {
			max=sum;
			ansStart = start;
            ansEnd = i;
		}
		if(sum<0) {
			sum=0;
		}
	}
	return max;
}
}
