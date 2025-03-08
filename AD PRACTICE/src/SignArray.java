import java.util.*;

public class SignArray {

    public static void main(String[] args) {
        int ar[] = {1, 2, -4, -5};
        int[] ans = sign(ar);

        for (int i = 0; i < ar.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    public static int[] sign(int ar[]) {
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        for (int i = 0; i < ar.length; i++) {
            if (ar[i] > 0) {
                pos.add(ar[i]);
            } else {
                neg.add(ar[i]);
            }
        }

        for (int i = 0; i < Math.min(pos.size(), neg.size()); i++) {
            ar[2 * i] = pos.get(i);
            ar[2 * i + 1] = neg.get(i);
        }

        return ar;
    }
}
