import java.util.Scanner;
class YoungerAgeException extends RuntimeException{
	YoungerAgeException(String msg){
		super(msg);
	}
}
public class A3Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);

		System.out.println("enter the age");
		int age=sc.nextInt();
		try {
		if(age<=18) {
			throw new YoungerAgeException("you are not eligible to vote");
		}
		else {
			System.out.println("YOU CAN VOTE");
		
		}
		}
		catch(YoungerAgeException e){
			System.out.println("handel it"+e);
		}

	}

}
