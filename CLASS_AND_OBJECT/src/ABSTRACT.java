abstract class parent{
parent() {
System.out.println("i am base class connstructor");	
}

abstract void greet();




abstract void greet2();
void getdata() {
	
}

}
class child extends parent{
		
	@Override
	
	public void greet() {
		System.out.println("hello");
	
		
	}

	@Override
	public void greet2() {
		System.out.println("good morning");
	}
	
}
class child2 extends parent{
	public void greet() {
		System.out.println("ni how");
	}
	public void greet2() {
		System.out.println("bla bla");
	}
}
public class ABSTRACT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child c=new child();
		c.greet();
		c.greet2();

		child2 aa=new child2();
		aa.greet();
		aa.greet2();
		
		
	}
}
