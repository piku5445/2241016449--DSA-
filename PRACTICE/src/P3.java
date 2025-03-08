import java.util.Scanner;
public class P3 {
	public static int  sumcoloum(int [] []ar,int m,int n) {
		int i=0;
		for( i=0;i<m;i++) {
			int sum=0;
			
			for(int j=0;j<n;j++) 
				sum=sum+ar[i][m];
		
			ar[i][n]=sum;
		}
		return ar[i][n];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner (System.in);
System.out.println("enter the number of rows ");
int m=sc.nextInt();
System.out.println("enter the number of coloumn ");
int n=sc.nextInt();
int [] []ar= new int [m+1][n+1];
for(int i=0;i<m;i++) {
	for(int j=0;j<n;j++) {
		 ar[i][j]  =sc.nextInt();
	}
}
System.out.println("the required sum of coloumn "+sumcoloum(ar,m,n));
	}

}
