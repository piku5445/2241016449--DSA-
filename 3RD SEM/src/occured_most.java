import java.util.Scanner;
public class occured_most {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the numner of array in A");
int n=sc.nextInt();

int ar[]=new int[n];
System.out.println("enter the array1");
for(int i=0;i<n;i++) {
	ar[i]=sc.nextInt();
	
}
for(int i=0;i<n;i++) {
	for(int j=i+1;j<n;j++) {
		if(ar[i]==ar[j]) {
			System.out.println("the first repeated element will be of "+ar[i]);
		}
	}
}

	}

}
