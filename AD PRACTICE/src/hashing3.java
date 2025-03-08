import java.util.*;
public class hashing3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Intersection of two array
		int a[]= {10,39,50,40,10,40}
		;
		int b[]= {10,40,30,29,20,30};
		System.out.println(intersection(a,b));
	}
public static int intersection(int []a,int []b) {
	HashSet<Integer> s=new HashSet<>();
	
	int count =0;
	for(int x:a) {
		s.add(x);
	}
	for(int x:b) {
		if(s.contains(x)) {
			count++;
			s.remove(x);
		}
	}
	return count;
	//return s.size();
}}
