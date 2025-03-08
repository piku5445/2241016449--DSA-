
public class dp11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {9,3,4,6,31};
		int re=binarysearch(arr,0,arr.length-1);
System.out.println(re);
	}
public static int binarysearch(int ar[],int lb,int ub) {
	int small=0;
	if(lb<ub) {
		
		int mid=(lb+ub)/2;
		if(ar[mid]<ar[mid+1]&&ar[mid]<ar[mid-1]) {
			small=mid;
		return small;
		}
		else {
		return (binarysearch(ar,lb,mid-1));	
}
	}
			
	

	
	return -1;
	

	

}}
