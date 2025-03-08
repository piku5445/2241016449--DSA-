package csw;
import java.util.*;
public class q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
TreeSet<Integer> t1=new TreeSet<>();
t1.add(3);
t1.add(2);
t1.add(9);
t1.add(6);
t1.add(5);
System.out.println(t1);
System.out.println("enter the number ");
int t=sc.nextInt();
System.out.println(t1.contains(t));
//if(t1.contains(t)) {
//	System.out.println("the ");
//}
System.out.println("enter the number to remove ");
int n=sc.nextInt();
t1.remove(n);
System.out.println(t1);
	}

}
