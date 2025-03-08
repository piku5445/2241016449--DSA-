import java.util.Arrays;
public class selection_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] ar= {8,4,1,5,9,2};
		for(int i=0;i<ar.length-1;i++) {
			int min=i;
			for(int j=i+1;j<ar.length;j++)
			if(ar[j]<ar[min]) {
				min=j;
				
			}
			if(min!=i) {
				swap(ar,min,i);
				
			}
				}
		System.out.println("the sorted element will be");
		for( int i=0;i<ar.length;i++) {
			System.out.println(ar[i]);
		}

	}
	public static void swap(int[] arr, int i, int j) {
	    int temp = arr[i];
	    arr[i] = arr[j];
	    arr[j] = temp;
	}
	}


