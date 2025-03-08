package recurssion;
import java.util.*;

public class permutation2 {

    public static void main(String[] args) {
       
        int ar[] = {1, 2, 3};
               
        List<List<Integer>> result = show(ar);       
        System.out.println("The given result is:");
        System.out.println(result.toString());
    }

   
    public static void permute(int ar[], List<List<Integer>> ans, int ind) {
      
        if (ind == ar.length) {
            List<Integer> al = new ArrayList<>();
            for (int i = 0; i < ar.length; i++) {
                al.add(ar[i]);
            }
            ans.add(new ArrayList<>(al));
            return;
        }  
        for (int i = ind; i < ar.length; i++) {
            swap(i, ind, ar);
            permute(ar, ans, ind + 1);
            swap(i, ind, ar); 
        }
    }
    public static void swap(int i, int j, int[] ar) {
        int t = ar[i];
        ar[i] = ar[j];
        ar[j] = t;
    }
    public static List<List<Integer>> show(int ar[]) {
        List<List<Integer>> ans = new ArrayList<>();
        permute(ar, ans, 0);
        return ans;
    }
}
