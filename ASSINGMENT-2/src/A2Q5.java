class deposit{
	long Principal;
	int Time;
	double rate;
	double total_amt;
	
	deposit(){
		
	}
	deposit(long Principal ,int Time , double total_amt ){
		this.Principal=Principal;
		this.Time=Time;
		this.total_amt=total_amt;
	}
	deposit(long Principal,int Time){
		this.Principal=Principal;
		this.Time=Time;
	}
	deposit(long Principal,double total_amt){
		this.Principal=Principal;
		this.total_amt=total_amt;
	}
	void display() {
		System.out.println(Principal+"\t\t"+Time+"\t"+total_amt);
		
	}
	
	void cal_amt() {
		
		total_amt=Principal+(Principal*rate*Time)/100;
	
	}

}

public class A2Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

deposit d1=new deposit();
d1.display();
deposit d2=new deposit(10034,2,3.3);
d2.display();
d2.cal_amt();
deposit d3=new deposit(10034,2);
d3.display();
d3.cal_amt();
deposit d4=new deposit(10034,3.3);
d4.display();
d4.cal_amt();
 

}
}