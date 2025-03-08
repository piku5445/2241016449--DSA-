
public class bsfirstandlast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// n = 8, arr[] = {2, 4, 6, 8, 8, 8, 11, 13}, k = 8
		int ar[]= {2,4,6,8,8,8,11,13};
		System.out.println("the first element is "+first(ar,0,ar.length-1,8)+"and the last elemrnt is "+last(ar, 0, ar.length, 8));
	}
public static int  first(int ar[],int l,int h,int target) {
	// TODO Auto-generated method stub
	int ans=-1;
	while(l<=h) {
		int mid=l+(h-1)/2;
		
		if(ar[mid]>=target) {
			ans=mid;
			h=mid-1;
			
		}
		else {
		l=mid+1;
		}
		
	}
	return ans;

}
public static int  last(int ar[],int l,int h,int target) {
	// TODO Auto-generated method stub
	int ans=-1;
	while(l<=h) {
		int mid= l + (h - l) / 2;
		
		if(ar[mid]<=target) {
			ans=mid;
			l=mid+1;
			
		}
		else {
		h=mid-1
		;
		}
		
	}
	return ans;

}
}
