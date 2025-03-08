package exception_handling;

public class CQ5{
public static <E> void printArray(E[]ar) {
	for(E ele:ar) {

		System.out.println(ele);
	}
	for(int i=0;i<3;i++) {
		System.out.println(ar[i]);
	}
	
}
public static void main(String []args) {
	Integer []ar= {10,20,30};
	printArray(ar);
	Double[]ar1= {10.5,18.3,32.2};
	printArray(ar1);
	String []ar2= {"kholi","dhoni","sachin"};
	printArray(ar2);
	
}

}
