import java.util.*;

public class Subarray {

    public static void main(String[] args) {
        int ar[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println(array(ar));
    }

    public static int array(int ar[]) {
        int max = Integer.MIN_VALUE; // Initialize max with the smallest possible integer

        for (int i = 0; i < ar.length; i++) {
            int sum = 0;
            int j = i;

            while (j < ar.length && sum >= 0) {
                sum += ar[j];
                max = Math.max(max, sum);
                j++;
            }
        }

        return max;
    }
}
