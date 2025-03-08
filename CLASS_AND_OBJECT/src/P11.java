import java.util.Scanner;

public class P11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[] ar= new int[5];
		int count =0;
		int max=ar[0];
		int min=0;
		int pos=0;
		for(int i=0;i<5;i++) {
			ar[i]=sc.nextInt();
			
		}
for(int i=0;i<5;i++) {
	if(max<ar[i]) {
		max=ar[i];
		count++;
		
	}
	pos=i;
	System.out.println(max,count, pos);
}

	}

}
