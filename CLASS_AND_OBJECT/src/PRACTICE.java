class circle{
	int r;
	circle(){
		System.out.println("I AM NOT PRAM CONSTRUSTOR");
		
	}
	circle(int r){
		System.out.println("i am parameterize constructor");
		this.r=r;
		
	}
	public int area() {
		return (int) (Math.PI*r*r);
		
	}
	
}
class rectangle extends circle{
public int height;
 rectangle(int r,int height){
	super(r);
	System.out.println("i am parameterize constructor");
	this.height=height;
	
	}
 public int volume() {
	 return (int)(Math.PI*r*r*height);
 }
}
	


public class PRACTICE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
rectangle rec=new rectangle(3, 4);
System.out.println("the volume of the rectangle will be "+rec.volume());
	}

}
