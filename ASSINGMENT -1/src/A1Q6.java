
public class A1Q6 {

public static boolean isodd(int n) {
	int r=0;
	while(n>0) 
		n=n-2;
		if (n==1) {
			return true;
			
		}
	
	
	else 
		return false;
	
	
}
public static void main(String[] args) {
	// TODO Auto-generated method stub
int n=35;
boolean res= isodd(n);
if(res==true) {
System.out.println("it is odd ");
}
else {
	System.out.println("it is even");
	
	
}

}

}
