

import java.util.*;

public class consecutivenumber1 {

    public static void main(String[] args) {
        int ar[] = {100, 200, 1, 3, 2, 4};
        System.out.println(brute(ar));
    }

    public static int brute(int [] ar) {
        int max = 0;
        int count = 1; // Start with 1 to account for the initial element
        for (int i = 0; i < ar.length - 1; i++) {
            if (ar[i + 1] == ar[i] + 1) {
                count++;
            } else {
                if (count > max) {
                    max = count;
                }
                count = 1; // Reset count for the next consecutive sequence
            }
        }
        // Check the last count
        if (count > max) {
            max = count;
        }
        // If no consecutive sequence found, return -1
        if (max == 1) {
            return -1;
        }
        return max;
    }
}

