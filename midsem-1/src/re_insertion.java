

public class re_insertion {

    public static void main(String[] args) {
        int[] arr = {8, 4, 1, 5, 9, 2};
        recursiveInsertionSort(arr, arr.length);
        
        System.out.println("The sorted elements are:");
        for (int i : arr) {
            System.out.println(i);
        }
    }

    static void recursiveInsertionSort(int[] arr, int n) {
    	int i=1;
        // Base case: If there is only one element or the array is empty, it is already sorted.
        if (i> n) {
            return;
        }

        // Sort the first n-1 elements recursively
        recursiveInsertionSort(arr, n - 1);

        // Insert the last element at its correct position in the sorted array
        int temp = arr[n - 1];
        int j = n - 2;

        // Move elements greater than lastElement to one position ahead of their current position
        while (j >= 0 && arr[j] > temp) {
            arr[j + 1] = arr[j];
            j--;
        }

        // Insert lastElement at its correct position
        arr[j + 1] = temp;
    }
}
