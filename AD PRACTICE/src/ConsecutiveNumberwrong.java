
import java.util.*;

public class ConsecutiveNumberwrong {

    public static void main(String[] args) {
        int ar[] = {100, 200, 1, 3, 2, 4};
        ArrayList<Integer> ans = brute(ar);
        System.out.println(brute(ar));
    }

    public static ArrayList<Integer> brute(int [] ar) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < ar.length - 2; i++) {
            if(ar[i + 1] == ar[i] + 1 && ar[i + 2] == ar[i] + 2) {
                list.add(ar[i]);
            }
        }
        // Check if the last three elements form a consecutive sequence
        if (ar[ar.length - 1] == ar[ar.length - 2] + 1) {
            list.add(ar[ar.length - 1]);
        }
		
        return list;
    }
}

