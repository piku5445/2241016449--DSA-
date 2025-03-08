
public class HAQ4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the array to be sorted");
		int []arr= {34,22,33,245,545};
		bubblesort(arr,5);
		for(int num:arr) {
			
			System.out.println(num+" ");
		}

	}
public  static void bubblesort(int []ar,int n) {
	if(n==1) {
		return;
	}
	else {
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-1;j++) {
				if(ar[j+1]<ar[j]) {
					int temp=ar[j+1];
					ar[j+1]=ar[j];
					ar[j]=temp;
				}
			}
		}
		bubblesort(ar,n-1);
	}
		
	
	
}
}
