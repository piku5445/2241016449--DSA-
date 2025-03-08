
public class bsfloor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=28;
System.out.println(floor(n));
	}
public static int floor(int  n) {
	int ans=1;
	for(int i=0;i<n;i++) {
		if(i*i<=n) {
			ans=i;
		}
		else break;
	}
	return ans;
}
}
