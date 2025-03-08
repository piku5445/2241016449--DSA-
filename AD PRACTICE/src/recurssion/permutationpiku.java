package recurssion;
import java.util.*;
public class permutationpiku {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int ar[]= {1, 2, 3};
List<List<Integer>> result=getlist(ar);
System.out.println("the given result is");
System.out.println(result.toString());
	}
public static  void list1(int ar[],List<List<Integer>> ans,List<Integer> al) {
	if(al.size()==ar.length) {
		ans.add(new ArrayList<>(al));
		return;
	}
	else {
		for(int i=0;i<ar.length;i++) {
			if(al.contains(ar[i]))
				continue;
			al.add(ar[i]);
			list1(ar, ans, al);
			al.remove(al.size()-1);
			}
		
		}
	}

public static List<List<Integer>> getlist(int []ar){
	List<List<Integer>>ans=new ArrayList<>();
	list1( ar,ans,new ArrayList<>());
	return ans; 
}
}
