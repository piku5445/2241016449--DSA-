class complex{
	int real;
	int imag;


public complex(int real,int imag) {
	this.real=real;
	this.imag=imag;
}
void putdata() {
	System.out.println(real+"+"+imag+"i");
}

public complex complex_add(complex c1,complex c2) {
	
	int  realsum=c1.real+c2.real;
	int imagsum=c1.imag+c2.imag;
	return new complex(realsum,imagsum);
}
}

public class A2Q2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
complex c1=new complex(2,3);
complex c2=new complex(4,-5);
complex c3=c1.complex_add(c1,c2);
c3.putdata();

	}
}
