import java.util.*;

public class Leaders {

    public static void main(String[] args) {
        int ar[] = {4, 7, 1, 0};
        System.out.println(leader(ar));
    }

    public static ArrayList<Integer> leader(int[] ar) {
        ArrayList<Integer> ans = new ArrayList<>();
        int i=0;
        for ( i = 0; i < ar.length; i++) {
            boolean leader = true;
            for (int j = i + 1; j < ar.length; j++) {
                if (ar[j] > ar[i]) {
                    leader = false;
                    break;
                }
            }
            if (leader) { // If no element to the right is greater, ar[i] is a leader
                ans.add(ar[i]);
            }
           
        }
       
        return ans;
    }
    
}
