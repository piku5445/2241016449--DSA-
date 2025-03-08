package exception_handling;

public class cqe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	int a=100;
	int b=0;
	int c=a/b;
	
}
catch(ArithmeticException e){
	System.out.println("it is an exception ");
	e.printStackTrace();
	//System.out.println(e.getMessage());
}


	}

}
