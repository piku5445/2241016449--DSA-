import java.util.Scanner;

public class countinginversion1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        int ar[] = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        int inversionCount = optimal(ar, 0, n - 1);
        System.out.println("Inversion Count: " + inversionCount);
    }

    public static int optimal(int ar[], int lb, int ub) {
        int count = 0;
        if (lb < ub) {
            int mid = (lb + ub) / 2;
            count += optimal(ar, lb, mid); // Accumulate count from left subarray
            count += optimal(ar, mid + 1, ub); // Accumulate count from right subarray
            count += merge(ar, lb, mid, ub); // Accumulate count from merging
        }
        return count;
    }

    public static int merge(int ar[], int l, int mid, int h) {
        int count = 0;
        int left = l;
        int right = mid + 1;
        int temp[] = new int[h - l + 1];
        int k = 0;
        while (left <= mid && right <= h) {
            if (ar[left] <= ar[right]) {
                temp[k++] = ar[left++];
            } else {
                temp[k++] = ar[right++];
                count += (mid - left + 1); // Increment count for inversions
            }
        }
        while (left <= mid) {
            temp[k++] = ar[left++];
        }
        while (right <= h) {
            temp[k++] = ar[right++];
        }
        for (int i = l, j = 0; i <= h; i++, j++) {
            ar[i] = temp[j];
        }
        return count;
    }
}
