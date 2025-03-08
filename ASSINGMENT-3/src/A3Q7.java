
public class A3Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("the fibonacci number is");
System.out.println(fibo(8));
System.out.println("the factorial number is ");
System.out.println(fact(5));
System.out.println("the power of the number is");
System.out.println(power(2,3));
System.out.println("the reverse of the number is \n"+rev(234,0));
	}
public static int  fibo(int x) {
	if(x==1) {
		return 0;
	}
	else if(x==2) {
		return 1;
	}
	else
		return (fibo(x-1)+fibo(x-2));
}
public static int fact(int x) {
	if(x==1) {
		return 1;
		
	}
	else
		return (fact(x-1)*x);
}
public static int power(int n,int x) {
	if(x==1) {
		return n;
	}

	else 
		x--;
	return (n*power(n,x));
}

	    public static int findGCD(int num1, int num2) {
	        // Base case: If num2 is 0, return num1
	        if (num2 == 0) {
	            return num1;
	        }
	        
	        // Recursive case: Calculate GCD by calling the function recursively with num2 and num1 % num2
	        return findGCD(num2, num1 % num2);
	    }

	   


public static int rev(int n,int sum) {
	if(n==0) {
		return sum;
	}
	else 
		return(rev(n/10,sum*10+n%10));
}

}
