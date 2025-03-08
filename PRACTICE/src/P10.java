import java.util.Scanner;
public class P10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Integer[] ar1=new Integer[5];
		System.out.println("enter the elements of array");
		for(int i=0;i<5;i++) 
			ar1[i]=sc.nextInt();
			System.out.println("enter the element to be searched");
			int e1=sc.nextInt();
			int rec=count(ar1,e1);
			System.out.println("the number of count is"+rec);
		
		
		

	}
	public static <T> int count(T[]ar,T item) {
		
		int count=0;
		for(int i=0;i<5;i++) 
		if(ar[i].equals(item)) 
			count++;
		return count;

}}
