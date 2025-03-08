class pointtype{
	int x_axis;
	int y_axis;
	pointtype(int x_axis,int y_axis) {
		this.x_axis=x_axis;
		this.y_axis=y_axis;
		
	}
	void getdata() {
		System.out.println("x axis is \t"+x_axis+" y axis is \t"+y_axis);
	}
}
class circletype extends pointtype{
	int radius;
	
	circletype(int x_axis, int y_axis,int radius) {
		super(x_axis, y_axis);
		this.radius=radius;
				}
	public int area(int radius) {
		
		return (int) (Math.PI*radius*radius);
	}

}
public class HAQ4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
pointtype p1=new pointtype(2,3);
pointtype p2=new pointtype(3,3);

	}

}
