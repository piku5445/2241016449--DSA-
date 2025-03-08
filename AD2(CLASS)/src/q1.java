import java.util.*;

public class q1 {

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
        q1 obj = new q1();
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
        List<Integer> arr = new ArrayList<>();
        int k=nums.length;
        for (int i = 0; i <nums.length; i++) {
      
            for (int j = i; j <k; j++) {
                arr.add(nums[j]);
                if (subset.contains(arr)) {
                    continue;
                }
                      
                // arr.remove(arr.size()-1);
              List<Integer> list1DeepCopy = new ArrayList<>(arr);  // Deep copy of list1
                
                subset.add(list1DeepCopy);
            }
            arr.clear();

        }
        List<Integer> emptyList = new ArrayList<>(); //added
        subset.add(emptyList); //added
        return subset;
      
    }
}
