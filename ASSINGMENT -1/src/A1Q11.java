import java.util.Scanner;
public class A1Q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of rows");
		int m=sc.nextInt();
		System.out.println("enter the number of column");
		int n=sc.nextInt();
		int [][]ar=new int[m+1][n+1];
		System.out.println("enter the values of matrix");
for(int i=0;i<m;i++) {
	for(int j=0;j<n;j++) {
		ar[i][j]=sc.nextInt();
	}
}

for(int i=0;i<m;i++) {
	int sum=0;
for(int j=0;j<n;j++) {
	System.out.print(ar[i][j]+" ");
	sum=sum+ar[i][j];
	




}
System.out.println(" ");
ar[i][n]=sum;
System.out.println("the sum of rows element are"+ar[i][n]);
}
for(int j=0;j<n;j++) {
	int sum=0;
for(int i=0;i<m;i++) {
	System.out.print(ar[i][j]+" ");
	sum=sum+ar[i][j];
	




}
System.out.println(" ");
ar[m][j]=sum;
System.out.println("the sum of coloumn element are"+ar[m][j]);
}

	}

}
