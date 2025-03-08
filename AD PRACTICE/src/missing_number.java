
public class missing_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int[] a = {3, 1, 2, 5, 4, 6, 7, 5};
        int[] ans = brute(a);
        System.out.println("The repeating and missing numbers are: {"
                           + ans[0] + ", " + ans[1] + "}");
	}
public static int[] brute(int ar[]) {
	int repeating=-1;
	int missing=-1;
	for(int i=1;i<=ar.length;i++) {
		int count =0;
		for(int j=0;j<ar.length;j++) {
			if(ar[j]==i) {
				count++;
			}
			
		}
		if(count==2) {
			repeating=i;
		}
		else if(count==0) {
			missing=i;
		}
		if(repeating!=-1&&missing!=-1) {
			break;
		}
	}
	int[] ans = {repeating, missing};
	return ans;
	
}

}
