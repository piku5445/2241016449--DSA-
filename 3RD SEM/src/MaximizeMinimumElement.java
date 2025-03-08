public class MaximizeMinimumElement {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // Example array

        int result = maximizeMinimum(array, 0, array.length - 1);

        System.out.println("Maximized Minimum Element: " + result);
    }

    // Recursive method to maximize the minimum element in the array
    public static int maximizeMinimum(int[] arr, int low, int high) {
        if (low == high) {
            return arr[low];
        }

        int mid = (low + high) / 2;

        int leftMax = maximizeMinimum(arr, low, mid);
        int rightMax = maximizeMinimum(arr, mid + 1, high);

        return Math.max(leftMax, rightMax);
    }
}
