
public class bs3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//arr[] ={3, 4, 4, 7, 8, 10}, x= 5
		int ar[]= {3,4,4,7,8,10};
		int target=5;
		System.out.println("the floor function is "+floor(ar, 0, ar.length-1, target)+"the ceiling function will be "+ceiling(ar, 0,ar.length-1, target));

	}
public static int floor(int ar[],int l,int h,int target) {
	int ind=-1;
	while(l<=h) {
	int mid=l+(h-1)/2;
	if(ar[mid]==target) {
		return mid;
	}
	else if(ar[mid]<target) {
		ind =mid;
		l=mid+1;
		
		
	}
	else {
		h=mid-1;
	}
	}
	return ind;
}
public static int  ceiling(int ar[],int l,int h,int target) {
	
	// TODO Auto-generated method stub
	int ans=-1;
	while(l<=h) {
		int mid=l+(h-1)/2;
		if(ar[mid]>target) {
			
			ans=mid;
			h=mid-1;
		}
		else {
			l=mid+1;
		}
	}
	return ans;

}
}
