import java.util.Scanner;
public class A3Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Number of Arrays");
int n=sc.nextInt();
String []ar=new String[n+1];
for(int i=0;i<n;i++) {
	ar[i]=sc.next();
	
}
try {
	int res=Integer.parseInt(ar[0]);
	System.out.println(res);
	}


catch(NumberFormatException e) {
System.out.println("exception caught"+e);
	
}
try {
ar[4]="green";
}
catch(ArrayIndexOutOfBoundsException f) {
	System.out.println("ecception"+f);;
}
for(int i=0;i<ar.length;i++) {
	System.out.println(ar[i]);
	
}


	}

}
