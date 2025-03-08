import java.util.*;

public class sorting1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ar[] = {1, 2, 2, 2, 2, 2, 4, 2, 4, 4, 1, 1};
        System.out.println(majorityelement(ar));
    }

    public static int majorityelement(int ar[]) {
        int n = ar.length;

        for (int i = 0; i < ar.length; i++) {
            int count = 0;
            for (int j = 0; j < ar.length; j++) {
                if (ar[i] == ar[j]) {
                    count++;
                }
            }
            if (count > n / 2) {
                return ar[i];
            }
        }
        return -1;
    }
}
