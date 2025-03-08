class A extends Thread{
public void run(){
	for(int i=0;i<10;i++) {
		System.out.println("i= "+i);
	}
}
}
class B extends Thread{
	public void run() {
		for(int j=0;j<10;j++) {
			System.out.println("j= "+j);
		}
	}
	
}
class C extends Thread{
	public void run() {
		for(int k=0;k<10;k++) {
			System.out.println("k= "+k);
		}
	}
}
public class TQ1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a1=new A();
		B b1=new B();
		C c1=new C();
		a1.start();
		b1.start();
		c1.start();

	}

}
