import java.util.Scanner;

public class MaxMinDifference {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Initialize maxDiff and minDiff with the difference between the first two elements
        int maxDiff = Math.abs(arr[0] - arr[1]);
        int minDiff = Math.abs(arr[0] - arr[1]);

        // Brute force approach to find maxDiff and minDiff
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int currentDiff = Math.abs(arr[i] - arr[j]);

                // Update maxDiff if the current difference is greater
                if (currentDiff > maxDiff) {
                    maxDiff = currentDiff;
                }

                // Update minDiff if the current difference is smaller
                if (currentDiff < minDiff) {
                    minDiff = currentDiff;
                }
            }
        }

        System.out.println("Maximum Difference: " + maxDiff);
        System.out.println("Minimum Difference: " + minDiff);
    }
}

