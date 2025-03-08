import java.util.Arrays;
public class selection_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] ar= {8,4,1,5,9,2};
		for(int i=0;i<ar.length-1;i++) {
			int min=i;
			for(int j=0;j<ar.length;j++)
			if(ar[j]<ar[min]) {
				min=j;
				
			}
			if(min!=i) {
				swap(ar,min,i);
				
			}
		}
	}
	public static void swap(int []arr,int n) {
		int temp=0;
		for(int i=0;i<n-1;i++) {
    		
    		if(arr[i+1]>arr[i]) {
    			temp=arr[i+1];
    			arr[i+1]=arr[i];
    			arr[i]=temp;
    		}
    	}
	}

}
