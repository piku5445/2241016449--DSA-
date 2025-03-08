package welcome_back;

public class req1 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = calculateSum(arr, arr.length - 1);
        System.out.println("Sum of elements in the array: " + sum);
    }

    public static int calculateSum(int[] arr, int index) {
        // Base case: if the index is negative, return 0
        if (index < 0) {
            return 0;
        }
        // Recursive step: sum the current element with the sum of the rest of the elements
        return arr[index] + calculateSum(arr, index - 1);
    }
    }
