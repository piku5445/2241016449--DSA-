
public class array_reduction2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [ ]ar= {5,1,1,1,2,3,5};
		int min=0;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]!=0&&ar[i]<ar[min]) {
				min=ar[i];
			}
		}
		int i=0;
		while(ar[i]!=0) {
			ar[i]=ar[i]-min;
		}

		int count=0;
		for( i=0;i<ar.length;i++) {
			if(ar[i]!=0) {
				count++;
			}
		}
		System.out.println(count);
	}

}
