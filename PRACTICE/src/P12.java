
public class P12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []ar= {3,43,1,45,14};
		bubbleSort(ar);
		displayArray(ar);
		
		}
		
	static void bubbleSort(int[] arr) {
        //CODE OF CHATGPT
     /*   for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        */
		int n = arr.length;
        for(int i=0;i<n-1;i++) {
        	for(int j=0;j<n-1;j++) {
        		
        		if(arr[j+1]>arr[j]) {
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

 /*   
		link ptr1=new link();
		link ptr2=new link();
		for(ptr1=node;ptr1.next!=null;ptr1=ptr1.next) {
			for(ptr2=ptr1.next;ptr2!=null;ptr2=ptr2.next) {
				if(ptr1.info>ptr2.info) {
					int t=ptr1.info;
					ptr1.info=ptr2.info;
					ptr2.info=t;
				
		int n = arr.length;     
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                 
          for(int i=0;i<n-1;i++) {
        	for(int j=i;j<n-1;j++) {
        		
        		if(arr[j+1]<arr[j]) {
        			int temp=arr[j+1];
        			arr[j+1]=arr[j];
        			arr[j]=temp;
 
	*/	
	 }
	

		
