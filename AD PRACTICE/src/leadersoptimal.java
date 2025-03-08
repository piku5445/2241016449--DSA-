import java.util.*;
public class leadersoptimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  
		  int arr[]=  {10, 22, 12, 3, 0, 6};
		  ArrayList<Integer> ans=optimal(arr);
		  Collections.sort(ans, Collections.reverseOrder());
System.out.println(ans);

	}
public static ArrayList<Integer> optimal(int[] arr){
	ArrayList<Integer> ans=new ArrayList<>();
	int n=arr.length;
	int max = arr[n - 1];

    ans.add(arr[n-1]);
    
    // Start checking from the end whether a number is greater
    // than max no. from right, hence leader.
    for (int i = n - 2; i >= 0; i--)
      if (arr[i] > max) {
        ans.add(arr[i]);
        max = arr[i];
      }

  return ans;
   
}
}
