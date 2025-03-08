
import java.util.*;

public class mergesort2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number ");
        int n = sc.nextInt();
        int ar[] = new int[n];
        System.out.println("before sorting array: ");
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        mergesort(ar, 0, n - 1);

        System.out.println("after sorting array: ");
        for (int i = 0; i < n; i++) {
            System.out.println(ar[i] + " ");
        }
    }

    public static void mergesort(int arr[], int l, int h) {
        if (l < h) {
            int mid = (l + h) / 2;
            mergesort(arr, l, mid);
            mergesort(arr, mid + 1, h);
            merge(arr, l, mid, h);
        }
    }

    public static void merge(int[] arr, int l, int mid, int h) {
        int i = 0;
        int temp[] = new int[h - l + 1];
        int left = l;
        int right = mid + 1;

        while (left <= mid && right <= h) {
            if (arr[left] <= arr[right]) {
                temp[i] = arr[left];
                left++;
            } else {
                temp[i] = arr[right];
                right++;
            }
            i++;
        }

        while (left <= mid) {
            temp[i] = arr[left];
            left++;
            i++;
        }

        while (right <= h) {
            temp[i] = arr[right];
            right++;
            i++;
        }

        // Copy the merged elements back to the original array
        for (i = 0; i < temp.length; i++) {
            arr[l + i] = temp[i];
        }
    }
}

