
public class bsfloor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int n = 28;
	        int ans = floor(n,0,n-1,n);
	        System.out.println("The floor of square root of " + n + " is: " + ans);
	}
public static int floor(int n,int l,int h,int i) {
	int mid=0;
	while(l<h) {
		 mid=l+(h-l)/2;
//		if(mid==i*i) {
//			return i;
//		}
		 int val=mid*mid;
		 if(val<=n) {
			l=mid+1;
			
		}
		else {
			h=mid-1;
		}
	}
	
	return h;
}
}
