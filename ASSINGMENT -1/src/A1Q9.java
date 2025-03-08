import java.util.Scanner;
public class A1Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the number of rows");
int m=sc.nextInt();
System.out.println("enter the number of coloumn");
int n=sc.nextInt();
int[][]ar=new int[m+1][n+1];
System.out.println("enter the values of matrix");
for(int i=0;i<m;i++) {
	for(int j=0;j<n;j++) {
		ar[i][j]=sc.nextInt();
	}
	
	
}
for(int i=0;i<m;i++) {
	for(int j=0;j<n;j++) {
		System.out.print(ar[i][j]+" ");
	}
	System.out.println();
	
}
	}

}
