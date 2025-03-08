
public class bs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3,2,1,5,6,7};
		
		boolean re=binarysearch(arr,0,arr.length-1,54);
System.out.println(re);
	}
public static boolean binarysearch(int ar[],int lb,int ub,int key) {
	if(lb<ub) {
		int mid=(lb+ub)/2;
		if(ar[mid-1]>key&&key<ar[mid+1]) {
		return true;
		}
		else if(ar[mid]>key) {
		return (binarysearch(ar,lb,mid-1,key));	
		}
		else {
			return(binarysearch(ar,mid+1,ub,key));
		}	
	}
	else {
		return false;
	}
}
}
