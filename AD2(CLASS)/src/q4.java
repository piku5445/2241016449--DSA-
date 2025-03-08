import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class q4 {
     public static void main(String[] args) {
        // Input for testing
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the array elements:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Create an instance of the class and call subsetsWithDup
        q4 obj = new q4();
        List<List<Integer>> result = obj.subsetsWithDup(nums);

        // Print the resulting subsets
        System.out.println("Subsets (with duplicates removed): ");
        for (List<Integer> subset : result) {
            System.out.println(subset);
        }
    }


    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> subset = new ArrayList<>();
        Arrays.sort(nums);
        subset.add(new ArrayList<>());
  
        int k=nums.length;
        int start=0;
        for (int i = 0; i <nums.length; i++) {
      start= (i> 0 && nums[i] == nums[i - 1]) ? k:i;

            for (int j = start; j <k; j++) {
               
                List<Integer> newSubset=new ArrayList<>(subset.get(j));
                newSubset.add(nums[j]);
                subset.add(newSubset);

            }
    
        }
       
        return subset;
      
    }
}
