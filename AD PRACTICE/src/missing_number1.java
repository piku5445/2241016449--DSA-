import java.util.*;
public class missing_number1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] ar={3, 1, 2, 5, 4, 6, 7, 5};
int [] ans=better(ar);
System.out.print(ans[0]+" " +ans[1]);
	}
public static int[] better(int ar[]) {
	int n=ar.length;
int [] hash= new int [n+1];
for(int i=0;i<ar.length;i++) {
	hash[ar[i]]++;
}
int repeating=-1;
int missing=-1;
for(int i=1;i<=ar.length;i++) {
	if(hash[i]==2)
		repeating=i;
	else if(hash[i]==0) missing=i;
	if(repeating!=-1&&missing!=-1) {
		break;
	}
}
int [] ans= {repeating,missing};
return ans;
}
}
