import java.util.*;
public class Nby3majorityelement1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int ar[]= {11,33,33,11,33,11};
List<Integer> ans=better(ar);
System.out.println(ans);
	}
public static ArrayList<Integer> better(int []ar) {
	ArrayList<Integer> list=new ArrayList<>();
	HashMap<Integer,Integer> ans=new HashMap<>();
	int count =0;
	int min=(int) ar.length/3;
	for(int i=0;i<ar.length;i++) {
		int value=ans.getOrDefault(ar[i],0);
		ans.put(ar[i], value+1);
		if(ans.get(ar[i])==min) {
			list.add(ar[i]);
			
			
		}
		if(list.size()==2)
		{
			break;
		}
		
		}
	return list;
		
	}

}
