import java.util.*;
public class missing_number2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] a = {3, 1, 2, 5, 4, 6, 7, 5};
	        int[] ans = optimal1(a);
	        System.out.println("The repeating and missing numbers are: {"
	                           + ans[0] + ", " + ans[1] + "}");
	}
public static int [] optimal1(int[]ar) {
	int n=ar.length;
	long sn=(n*(n+1))/2;
	long s2n=(n*(n+1)*(2*n+1))/6;
	// Calculate S and S2:
	long s=0;
	long s2=0;
	for(int i=0;i<n;i++) {
		s=s+ar[i];
		s2=s2+(long)ar[i]*(long)ar[i];
		
	}
	//s-sn=x-y;
	long val1=s-sn;
	//s2-s2n=x^2-y^2;
	long val2=s2-s2n;
	//Find X+Y = (X^2-Y^2)/(X-Y):
	val2=val2/val1;
	//Find X and Y: X = ((X+Y)+(X-Y))/2 and Y = X-(X-Y),
    // Here, X-Y = val1 and X+Y = val2:
	long x=(val1+val2)/2;
	long y=x-val1;
	int []ans = {(int)x,(int)y};
	return ans;
	}
}

