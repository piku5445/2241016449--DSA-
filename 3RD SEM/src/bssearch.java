

public class bssearch {

    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int target = 23;
        boolean result = optimal(arr, 0, arr.length - 1, target);
        System.out.println(result);
    }

    public static boolean optimal(int ar[], int l, int h, int target) {
        if (l <= h) {
            int mid = l + (h - l) / 2;

            if (ar[mid] == target) {
                return true;
            }

            if (ar[mid] > target) {
                return optimal(ar, l, mid - 1, target);
            } else {
                return optimal(ar, mid + 1, h, target);
            }
        }
        return false;
    }
}
