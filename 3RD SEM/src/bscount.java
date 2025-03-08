public class bscount {

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 8, 8, 11, 13};
        int n = 8, x = 8;
        int ans = count(arr, 0, n - 1, x);
        System.out.println("The number of occurrences is: " + ans);
    }

    public static int count(int ar[], int l, int h, int target) {
        int count = 0;
        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (ar[mid] == target) {
                count++;
            }
            if (ar[mid] <= target) {
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }
        return count;
    }
}
