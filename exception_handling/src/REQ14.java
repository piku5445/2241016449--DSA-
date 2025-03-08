import java.util.Scanner;

public class REQ14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string ");
		String str=sc.next();
		int ind= str.length()-1;
		occu(str, ind);
		

	}

	public static void occu(String str,int ind) {
		// TODO Auto-generated method stub
		int flag=0;
		if (ind==0) {
			System.out.println("the first occurans will be "+ str.charAt(ind));
			return;
		}
		else {
			occu(str,ind--);
			if(ind==str.charAt(str.length()-1)){
				System.out.println("the last occurance is");
			
			}
		}
	}

}
