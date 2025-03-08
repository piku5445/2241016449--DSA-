import java.util.*;
class addition extends Thread{
	int a;
	int b;
	addition(int a,int b){
		this.a=a;
		this.b=b;
	}
	public  void run() {
			System.out.println("the addition of two numbers is"+(a+b));
	}
}
class multiplication extends Thread{
	int a;
	int b;
	multiplication(int a,int b){
		this.a=a;
		this.b=b;
	}
	public void run() {
		System.out.println("the multiplication of two number is "+(a*b));
		
	}
}
class division extends Thread{
	int a;
	int b;
	division(int a,int b){
		this.a=a;
		this.b=b;
		
	}
	public void run() {
		try {
		if(b!=0) {
			System.out.println("the division of two number is "+(a/b));
		}}
		catch(ArithmeticException e){
			
		}
		
		
	}
}

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
addition c1=new addition(12,65);
multiplication m1=new multiplication(12,65);
division d1=new division(12,65);
c1.start();
m1.start();
d1.start();

	}

}
