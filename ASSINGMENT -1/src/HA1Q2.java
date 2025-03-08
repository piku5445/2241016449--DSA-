
import java.util .Scanner;
public class HA1Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int [] ar= new int[5];
for(int i=0;i<ar.length-1;i++) {
	ar[i]=sc.nextInt();
}
for(int j=ar.length-1;j>0;j--){
	System.out.println(ar[j]);
}
	}

}
