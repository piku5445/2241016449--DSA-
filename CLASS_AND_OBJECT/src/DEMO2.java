class OK{
	String name;
	final static int Class=2001;
	static int reg_no=1;
	

void getdata(String x){
	System.out.println("enter the details of the student");
	name=x;

	
}


void putdata() {
	System.out.println("name \t "+name+" class \t "+Class+" reg_no \t "+reg_no);
	
}


static void change() {
	reg_no++;
}


}



public class DEMO2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
OK s1= new OK();
OK s2= new OK();
s1.getdata("ram");
s1.putdata();

s2.getdata("shyam");
OK.change();
s2.putdata();

	}
	

}