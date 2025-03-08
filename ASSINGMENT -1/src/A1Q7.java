import java.util.Scanner;
public class A1Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
System.out.println("enter the rows");
int m=sc.nextInt();
System.out.println("enter the coloumn");
int n=sc.nextInt();
int[][]ar=new int[m][n];
System.out.println("enter the values of matrix");
int sum=0;
for(int i=0;i<m;i++) {
	for(int j=0;j<n;j++) {
		ar[i][j]=sc.nextInt();
		
	}
	
}

	
	


for(int i=0;i<m;i++) {
	
	for(int j=0;j<n;j++) {
		System.out.print(ar[i][j]+" ");
		sum=sum+ar[i][j];
	}
	
	System.out.println( );
	
}


System.out.println("the sum of elements are "+sum);

	}

}
