
import java.util.Scanner;
class MarksOutOfBoundException extends Exception{
	MarksOutOfBoundException(String s){
		super(s);
	}
}
public class A3Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println();
		System.out.println("enter the name of the student");
		String a=sc.next();
		System.out.println("enter the marks");
	int n=sc.nextInt();	
try {
	if(n<100) {
		System.out.println("the marks of the student is"+n);
	}
	else {
		throw new MarksOutOfBoundException("invalid marks");
	}
	
}
catch(MarksOutOfBoundException e){
	e.printStackTrace();
}
	}

}
