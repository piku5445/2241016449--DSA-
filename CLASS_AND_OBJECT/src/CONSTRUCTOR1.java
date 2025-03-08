class base{
	int x;
	
	public int getx() {
		return x;
	}
	
	public void setx(int x) {
		System.out.println("i am in base and setting x now");
		this.x=x;
		
		
	}
	public void putdata() {
		System.out.println("i am a constructor");
		
	}
	
}
class derived extends base{
	int y;
	
		public int gety() {
			return y;
		}
		
		public void sety(int y) {
			
			this.y=y;
			
		}
	}

public class CONSTRUCTOR1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
derived c1=new derived();
c1.setx(4);
System.out.println(c1.getx());



	}

}
