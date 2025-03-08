import java.util.Scanner;
public class P2 {
	public static int  sumdiagonal(int  [][] m,int n) {
		int res=0;
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==j) {
					res= res+m[i][j];
				}
				
			}
		}
		return res;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);

System.out.println("enter the number of coloumn ");

int n=sc.nextInt();
System.out.println("enter the values");
int [][]m=new int[n][n];
for(int i=0;i<n;i++) {
	for(int j=0;j<n;j++) {
		m[i][j]=sc.nextInt();
	}
}

System.out.print("the sum of the major diagonal is "+sumdiagonal(m,n));
	}
}




