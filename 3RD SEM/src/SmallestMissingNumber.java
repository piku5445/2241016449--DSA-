
public class SmallestMissingNumber {

    public static void main(String[] args) {
        int[] sortedArray = {0, 1, 2, 6, 9, 11, 15}; // Example sorted array

        int smallestMissing = findSmallestMissing(sortedArray, 0, sortedArray.length - 1);

        System.out.println("Smallest Missing Number: " + smallestMissing);
    }

    // Recursive method to find the smallest missing number
    public static int findSmallestMissing(int[] arr, int low, int high) {
        if (low > high) {
            return low; // If all elements in the array are present
        }

        int mid = low + (high - low) / 2;

        // If the middle element is not equal to its index, the missing number is on the left side
        if (arr[mid] != mid) {
            return findSmallestMissing(arr, low, mid - 1);
        } else {
            // If the middle element is equal to its index, the missing number is on the right side
            return findSmallestMissing(arr, mid + 1, high);
        }
    }
}
