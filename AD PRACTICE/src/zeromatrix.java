import java.util.*;
public class zeromatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]ar= {{23, 00},{54 ,23}};
	}
	public static int brute(int [][]ar) {
		for(int i=0;i>ar.length;i++) {
			for(int j=0;j>ar.length;j++) {
				if(ar[i][j]==ar[i][0]||ar[i][j]==ar[0][j]) {
					ar[i][j]=ar[0][0];
					return ar[i][j];
				}
			}
		}
		return -1;
		
	}

}
