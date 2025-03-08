//constructor in inheritance
class base1{
	base1(){
		System.out.println("i am the constructor");
	}
	base1(int a){
		System.out.println("i am overloded constructor with value of a as "+a);
	}
	public int x;
	public int getx() {
	return x;	
	}
	public void setx(int x) {
		this.x=x;
		
	}
}

class derived1 extends base1{
	public int y;
	derived1(){
		super(0);
		System.out.println("I AM DERIVED CLASS CONSTRUCTOR");
	}
	public int gety() {
	return y;	
	}
	public void sety(int y) {
		this.y=y;
		
	}
	
}






 stub
//base1 b=new base1();
derived1 d=new derived1();


	}

}
