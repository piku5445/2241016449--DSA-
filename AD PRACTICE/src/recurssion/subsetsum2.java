package recurssion;
import java.util.*;
public class subsetsum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[]= {1,2,2};
		List<List<Integer>> ans=bringsubset(ar);
		System.out.println("the unique subset is");
		System.out.println(ans.toString().replace(",", " "));

	}
public static void Ssum2(int ind ,int ar[] ,List<Integer>dl,List<List<Integer>> ans) {
	
		ans.add(new ArrayList<>(dl));
			for(int i=ind;i<ar.length;i++) {
				if(i!=ind&&ar[i]==ar[i-1])continue;
				dl.add(ar[i]);
				Ssum2(i+1,ar,dl,ans);
		dl.remove(dl.size()-1);
			
		
	}
}
public static List<List<Integer>> bringsubset(int ar[]){
	Arrays.sort(ar);
	List<List<Integer>> ans=new ArrayList<>();
	Ssum2(0,ar,new ArrayList<>(),ans);
	return ans;
}
}
