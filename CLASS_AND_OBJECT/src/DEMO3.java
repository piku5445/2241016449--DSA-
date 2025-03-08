class bank{
	String name1;
	String ifsc_code; 
	
	
	
bank(String name,String ifsc_code)	
	{
	this.name1=name1;
	this.ifsc_code=ifsc_code;
	}
	
	void putdata() {
		System.out.println("the name of the member"+name1);
		System.out.println("the ifsc code is"+ifsc_code);
	}
	
	class costomer extends bank{
		String name;
		long acc_no;
		String type_of_bank;
		costomer(String name1,String ifsc_code,String name,long acc_no,String type_of_bank){
			super(name,type_of_bank);
			this.name=name;
			this.acc_no=acc_no;
			this.type_of_bank=type_of_bank;
			
		}
		void putdata() {
			System.out.println(name);
			System.out.println(acc_no);
		
			System.out.println(type_of_bank);
			
		}
	}
	public class DEMO3 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			costomer e1= new costomer("ffy", "gv", "jhjj", 67, "hjj");
			e1.putdata();
		

		}

	}

	
}
