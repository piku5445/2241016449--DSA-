import java.util.Scanner;

public class CheckReverse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        boolean result = checkReverse(arr, size);

        if (result) {
            System.out.println("The array is reversed at some point.");
        } else {
            System.out.println("The array is not reversed at any point.");
        }
    }

    public static boolean checkReverse(int[] arr, int size) {
        int start = -1;
        int stop = -1;

        for (int i = 0; i < size - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                start = i;
                break;
            }
        }

        if (start == -1) {
            // The array is already sorted in ascending order
            return false;
        }

        for (int i = start; i < size - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                stop = i;
                break;
            }
        }

        stop = (stop == -1) ? size - 1 : stop;

        // Check if the remaining portion is sorted in descending order
        for (int i = stop; i < size - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                return false;
            }
        }

        return true;
    }
}

