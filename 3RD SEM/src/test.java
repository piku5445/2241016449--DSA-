
public class test {

    public static void main(String[] args) {
        int ar[] = {2, 4, 6, 8, 8, 8, 11, 13};
        System.out.println("the first element is " + first(ar, 0, ar.length - 1, 8) + " and the last element is " + last(ar, 0, ar.length - 1, 8));
    }

    public static int first(int ar[], int l, int h, int target) {
        int ans = -1; // Initialize answer to -1 (not found)
        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (ar[mid] >= target) {
                ans = mid;
                h = mid - 1; // Look in the left half
            } else {
                l = mid + 1; // Look in the right half
            }
        }
        return ans;
    }

    public static int last(int ar[], int l, int h, int target) {
        int ans = -1; // Initialize answer to -1 (not found)
        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (ar[mid] <= target) {
                ans = mid;
                l = mid + 1; // Look in the right half
            } else {
                h = mid - 1; // Look in the left half
            }
        }
        return ans;
    }
}
