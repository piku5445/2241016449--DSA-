import java.util.*;

public class Moores {
    public static void main(String[] args) {
        int ar[] = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(sum(ar));
    }

    public static int sum(int ar[]) {
        int count = 1;
        int ele = ar[0];

        for (int i = 1; i < ar.length; i++) {
            if (ar[i] == ele) {
                count++;
            } else {
                count--;
                if (count == 0) {
                    ele = ar[i];
                    count = 1;
                }
            }
        }

        int count1 = 0;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] == ele) {
                count1++;
            }
        }

        if (count1 > ar.length / 2) {
            return ele;
        }

        return -1;
    }
}
