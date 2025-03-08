
import java.util.*;

public class mergesortedarray3 {

    public static void main(String[] args) {
        int[] arr1 = {1, 4, 8, 10};
        int[] arr2 = {2, 3, 9};
        int n = 4, m = 3;
        optimal2(arr1, arr2);
        System.out.println("The merged arrays are:");
        System.out.print("arr1[] = ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.print("\narr2[] = ");
        for (int i = 0; i < m; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();

    }

    public static void optimal2(int ar1[], int ar2[]) {
        int n = ar1.length;
        int m = ar2.length;
        int len = n + m;
        int gap = (len) / 2 + (len % 2);
        while (gap > 0) {
            int left = 0;
            int right = left + gap;
            while (right < len) {
                if (left < n && right < n) {
                    swapifgreater(ar1, ar1, left, right);
                } else if (left < n && right >= n) {
                    swapifgreater(ar1, ar2, left, right - n);
                } else {
                    swapifgreater(ar2, ar2, left - n, right - n);
                }
                left++;
                right++;
            }

            if (gap == 1) {
                break;
            }
            gap = (gap / 2) + (gap % 2);
        }

    }

    private static void swapifgreater(int[] ar1, int[] ar2, int ind1, int ind2) {
        if (ar1[ind1] > ar2[ind2]) {
            int temp = ar1[ind1];
            ar1[ind1] = ar2[ind2];
            ar2[ind2] = temp;
        }
    }
}
