package welcome_back;

public class req2 {

	
	    public static void main(String[] args) {
	        int[] arr = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
	        
	        int max = findMax(arr, 0, arr.length - 1);
	        int min = findMin(arr, 0, arr.length - 1);
	        
	        System.out.println("Maximum element: " + max);
	        System.out.println("Minimum element: " + min);
	    }

	    // Recursive function to find the maximum element in the array
	    public static int findMax(int[] arr, int start, int end) {
	        if (start == end) {
	            return arr[start];
	        }
	        
	        int mid = (start + end) / 2;
	        int max1 = findMax(arr, start, mid);
	        int max2 = findMax(arr, mid + 1, end);
	        
	        return Math.max(max1, max2);
	    }

	    // Recursive function to find the minimum element in the array
	    public static int findMin(int[] arr, int start, int end) {
	        if (start == end) {
	            return arr[start];
	        }
	        
	        int mid = (start + end) / 2;
	        int min1 = findMin(arr, start, mid);
	        int min2 = findMin(arr, mid + 1, end);
	        
	        return Math.min(min1, min2);
	    }
	}


