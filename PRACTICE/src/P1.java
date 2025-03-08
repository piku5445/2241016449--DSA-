import java .util.Scanner;

public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the number of rows");

int m=sc.nextInt();
System.out.println("enter the number of coloumn");
int n=sc.nextInt();
int [][]ar=new int[m][n];
for(int i=0;i<m;i++) {
	for(int j=0;j<n;j++) {
		ar[i][j]=sc.nextInt();
		
	}
}
int sum=0;
for(int i=0;i<m;i++) {
	for(int j=0;j<n;j++) {
	sum=sum+ar[i][j];
		
	}
}
System.out.println("the sum of every element in the array is "+sum);
	}

}
