import java.util.Scanner;
public class CW1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		    public static String even_or_odd(int number) {
		        //Place code here
		      Scanner sc=new Scanner(System.in);
		      System.out.print("enter the number");
		      int n=sc.nextInt();
		      evenorodd(n);
		        
		    }
		  public static String evenorodd(int num){
		    if(num%2==0)
		      return "even";
		    return "odd";
		      

		  }
		
	}

}
