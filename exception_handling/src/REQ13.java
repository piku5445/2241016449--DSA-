import java.util.Scanner;
public class REQ13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String str=sc.next();
int ind=str.length()-1;
rev(ind,str);	
	 }
public static void  rev(int ind,String str) {
	if(ind==0) {
		System.out.println(str.charAt(ind));
	return;
	}
	else {
		System.out.println(str.charAt(ind));
		rev(ind=ind-1,str);
	}
}
}
