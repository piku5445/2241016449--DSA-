import java.util.Scanner;

public class firstrepeated {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int firstRepeated = findFirstRepeatedNumber(arr);

        if (firstRepeated != -1) {
            System.out.println("The first repeated number is: " + firstRepeated);
        } else {
            System.out.println("No repeated numbers found.");
        }
    }

    static int findFirstRepeatedNumber(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    return arr[i]; // Found the first repeated number
                }
            }
        }

   return -1; // No repeated numbers found
    }
}
