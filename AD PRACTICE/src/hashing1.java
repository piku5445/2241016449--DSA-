import java.util.*;
public class hashing1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		write a programe to count distinct element in the array
int ar[]= {10,20,5,10,20,30};
System.out.println(count(ar));
	}
public static int count(int ar[]) {
	HashSet<Integer> s=new HashSet<>();
	for(int element:ar) {
		s.add(element);
	}
	return s.size();
}
}
