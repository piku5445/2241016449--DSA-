import java.util.*;

public class nby3majorityelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[]= {1,2};
//		System.out.println(brute(ar));
		System.out.println(majorityElement(ar));

	}
//public static int brute(int []ar) {
//	for(int i=0;i<ar.length;i++) {
//		int count=0;
//		int ele=ar[i];
//		for(int j=0;j<ar.length;j++) {
//			if(ar[j]==ar[i]) {
//				count++;
//			}
//			
//		}
//		if(count>ar.length/3) {
//			return ar[i];
//		}
//	}
//	return -1;
//}
	public static List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer>ans=new ArrayList<>();
        int c=0;
        for(int i=0;i<nums.length;i++){
            int count =0;
            if(ans.size()==0||ans.indexOf(0)!=nums[1])
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }

            }
//            if(count>nums.length/3){
//                ans.add(nums[i]);
//                break;
//                
//            }
            if (count >nums.length/3 && !ans.contains(nums[i])) {
                ans.add(nums[i]);
            }
        }
        return ans;
        }
        
//        
//        return ans;
//    }
}
