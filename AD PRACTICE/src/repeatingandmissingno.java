import java.util.Arrays;

public class repeatingandmissingno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int[] a = {3, 1, 2, 5, 4, 6, 7, 5};
		   
	        int ans = brute(a);
	        System.out.println(ans);
	        
	}
public static int brute(int ar[]) {
	Arrays.sort(ar);
	int c=0;
	for(int i=0;i<ar.length;i++) {
		int count =0;
	for(int j=0;j<ar.length;j++) {
		if(ar[i]==ar[j]) {
			count++;
		}
		if(count>=0&&ar[j]!=i) {
			return ar[j];
		}
		
	}
	
	
}
	return -1;
}}
