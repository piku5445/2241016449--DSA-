package welcome_back;
import java.util.Scanner;
public class p2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int []ar=new int[n];
int k=sc.nextInt();
int t;
System.out.println("enter the list of elements ");
for(int i=0;i<n;i++) {
	ar[i]=sc.nextInt();
}
for(int j=1;j<k;j++) {
	 t=ar[0];
	for(int i=1;i<n;i++) {
		ar[i-1]=ar[i];
		
	}
	ar[n-1]=t;
}
for(int i=0;i<n;i++) {
	System.out.println(ar[i]);
}
	}

}
