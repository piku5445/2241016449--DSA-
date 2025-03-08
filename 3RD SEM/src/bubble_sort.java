
public class bubble_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []ar= {3,43,1,45,14};
		bubbleSort(ar);
		displayArray(ar);
	}
	static void bubbleSort(int[] arr) {
	int n = arr.length;
    for(int i=0;i<n-1;i++) {
    	for(int j=0;j<n-1;j++) {
    		
    		if(arr[j+1]<arr[j]) {
    			int temp=arr[j+1];
    			arr[j+1]=arr[j];
    			arr[j]=temp;
    		}
    	}
    }
}
	static void displayArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

}
