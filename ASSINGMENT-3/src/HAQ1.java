class invalidbalanceException extends Exception{
	invalidbalanceException(String msg){
		super(msg);
	}
	
}
class bank{
	int acc_no;
	String name;
	double balance;
	bank(int acc_no,String name,double balance) {
		try{
			this.balance=balance;
		if(balance<0) {
			throw new invalidbalanceException("balance cant be less than 0");
			
		}
		}
		
		catch(invalidbalanceException e) {
			System.out.println(e);
		}
		this.acc_no=acc_no;
		this.name=name;
		}
	void putdata() {
		System.out.println(acc_no+" "+name+" "+balance);
	}
	
	}


public class HAQ1 {

	public static void main(String[] args) throws invalidbalanceException {
		// TODO Auto-generated method stub
bank b1=new bank(789, "ytf", 89);
b1.putdata();
bank b2=new bank(867,"uy",0);
b2.putdata();

	}

}
