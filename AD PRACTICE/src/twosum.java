import java.util.*;
public class twosum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int target =14;
int ar[]= {2,6,5,8,11};
int sum=0;
for(int i=0;i<ar.length;i++) {
	for(int j=i+1;j<ar.length;j++) {
		if(ar[i]+ar[j]==target) {
			System.out.println("the particular elements are "+ar[i]+"+"+ar[j]+"="+target);
			break;
			
		}
	}
}
	}

}
