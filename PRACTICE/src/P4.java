class complex{
	int real;
	int imag;
	complex(int real,int imag){
		this.real=real;
		this.imag=imag;
		
	}
	void getdata() {
		System.out.println(imag+"i + "+real);
	}
	public static complex add(complex  c1,complex c2) {
		int realsum=c1.real+c2.real;
		int imagsum=c1.imag+c2.imag;
		return new complex(realsum,imagsum);
	}
	
}
public class P4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
complex c1=new complex(23,45);


complex c2=new complex(22,34);

complex c3= c1.add(c1,c2);
c3.getdata();
	}

}
