class complex1{
	int real;
	int imag;
	void setdata(int real,int imag) {
		this.real=real;
		this.imag=imag;
		
	}
	void getdata() {
		System.out.println(real+"i "+imag);
		
	}
	public complex1 add(complex1 c1,complex1 c2) {
		complex1 result=new complex1();
		int real=c1.real+c2.real;
		int imag=c2.imag+c2.imag;
		return result;
	}
	void setdata(complex1 c1,complex1 c2) {
	
	}
}


public class P5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
complex1 c1=new complex1();
c1.setdata(3,5);
complex1 c2=new complex1();
c2.setdata(4, 7);
complex1 c3=new complex1();

c3.setdata(c1,c2);
c3.getdata();
	}

}
