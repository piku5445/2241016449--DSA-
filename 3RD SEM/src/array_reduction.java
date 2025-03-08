import java.util.Arrays;

public class array_reduction {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [ ]ar= {5,1,1,1,2,3,5};
		Arrays.sort(ar);
		int count=1;
		int min=ar[0];
		for(int i=0;i<ar.length;i++) {
			if(ar[i]-min>0) {
				min=ar[i];
				count+=1;
			}
		}
		System.out.println("the total number of reduction will be "+count);
		
		
	}

}
