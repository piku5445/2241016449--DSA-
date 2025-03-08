package binarysearch;
public class bssearchrotedarray {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int n = 9, k = 1;
        int ar[] = {7, 8, 9, 1, 2, 3, 4, 5, 6};
       
        int ans = search(ar, 0, n - 1, k);
        if (ans == -1)
            System.out.println("Target is not present.");
        else
            System.out.println("The index is: " + ans);
    }

    public static int search(int ar[], int l, int h, int k) {
        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (ar[mid] == k) {
                return mid;
            }
            if (ar[l] <= ar[mid]) {
                if (ar[l] <= k && k < ar[mid]) {
                    h = mid - 1;
                } else {
                    l = mid + 1;
                }
            } else {
                if (ar[mid] < k && k <= ar[h]) {
                    l = mid + 1;
                } else {
                    h = mid - 1;
                }
            }
        }
        return -1;
    }
}
