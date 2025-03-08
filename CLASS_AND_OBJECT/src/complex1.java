class complex{
	int real;
	int imag;
	 
	complex(int real,int imag){
		this.real=real;
		this.imag=imag;
	}
	void getdata() {
		System.out.println(" real \n "+real+" imag \n"+ imag+"i");
	}
	public   complex sum(complex c1,complex c2) {
		int realsum=c1.real+c2.imag;
		int imagsum=c1.imag+c2.imag;
		return new complex(realsum,imagsum);
	}
		
	
}
public class complex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
complex c1=new complex(1, 2);
c1.getdata();
complex c2=new complex(2,5);
c2.getdata();
complex sum1= c1.sum(c1,c2); 
	}

}
