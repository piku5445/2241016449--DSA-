import java.util.*;
public class countinginversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {5, 4, 3, 2, 1};
        int n = 5;
        int cnt = brute(a);
        System.out.println("The number of inversions is: " + cnt);

	}
public static int brute(int ar[]) {
	int count=0;
	for(int i=0;i<ar.length;i++) {
		for(int j=i+1;j<ar.length;j++) {
			if(ar[i]>ar[j]) {
				count++;
			}
		}
	}
	return count;
}
}
