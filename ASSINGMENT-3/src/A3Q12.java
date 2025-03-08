import java.util.Scanner;
public class A3Q12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Number ");
int lucky= sc.nextInt();
try {
	if(lucky>0) {
		System.out.println("It is your lucky NUmber ");
		
	}
	else {
		throw new NumberFormatException("it is an invalid input");
			
		
	}
	
}
catch(NumberFormatException e) {
	e.printStackTrace();
}


	}

}
