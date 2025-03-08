import java.util.*;

public class mergesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number ");
		int n=sc.nextInt();
		int ar[]=new int[n];
		System.out.println("before sorting array: ");
		for(int i=0;i<n;i++) {
			ar[i]=sc.nextInt();
		}
		mergesort(ar,0,n-1);
		
		for(int i=0;i<n;i++) {
			System.out.println(ar[i]+ " ");
		}
		
		

	}
public static void mergesort(int arr[],int l,int h) {
	if(l<h) {
		int mid=(l+h)/2;
		mergesort(arr,l,mid);
		mergesort(arr,mid+1,h);
		merge(arr,l,mid,h);
	}
}
public static void merge(int []arr,int l, int mid, int h) {
	// TODO Auto-generated method stub
	int i=0;
	int temp[]=new int[h-l+1];
	int left=l;
	int right=mid+1;
	while(left<=mid&&right<=h) {
		if(arr[l]<=arr[mid]) {
			temp[i]=arr[left];
			left++;
			
		}
		else {
			temp[i]=arr[right];
			right++;
		}
		i++;
		
	}
	while(left<=mid){
		temp[i]=arr[left];
		left++;
		i++;
	}
	
	while(right<=h) {
		temp[i]=arr[right];
		right++;
		i++;	
		}
	for(int i1=0;i1<temp.length;i1++) {
		arr[l+1]=temp[i1];
		
	}
		
}
}
