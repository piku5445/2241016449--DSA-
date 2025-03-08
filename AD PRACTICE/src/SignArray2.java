import java.util.*;
public class SignArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int ar[]= {-3,-2,-1,1,2,3};

	}
public static int[] better(int ar[]) {
	int r=1;
	int j=0;
	int i=0;
	int n=ar.length;
	int M[]=new int [n];
	while(r<n||j<n) {
		if(ar[i]>0) {
			M[j]=ar[i];
			j=j+2;
			i++;
			
		}
		else
		{
			M[r]=ar[i];
			r=r+2;
			i++;
		}
	}
	return M;
}

}
