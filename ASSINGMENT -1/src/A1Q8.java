import java.util.Scanner;
public class A1Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the number  of array");
int n=sc.nextInt();
int[]ar=new int[n];
System.out.println("enter the values of array");
for(int i=0;i<n;i++) {
	ar[i]=sc.nextInt();
}
int max=ar[0];
int count=0;
int flag=0;
int m=0;int i=0;
int min=0;
int flag1=0;
for( i=0;i<n;i++) {
	if(max<ar[i]) {
		max=ar[i];
		flag++;
		
	}
	 if(min>ar[i]) {
		min=ar[i];
		flag1++;
	}
	
	count=i;
	m=max;
}
if(flag>1) {
	System.out.println("the maximum number is "+m+" it is in the position "+ count+" it occurs first at "+flag);
}
 if(flag1>1) {
	System.out.println("the minimum number is"+min+ " it is in the position "+count+" it occurs first at "+flag1);
}
else {
	System.out.println("IT IS NOT");
}

	}

}
