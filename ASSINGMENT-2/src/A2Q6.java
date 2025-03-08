/*abstract class shape{
	abstract double getarea();
	
}
class square extends shape{
	double side;
	square(double s){
		side=s;
		
	}
	double getarea() {
	return side*side;
	
	}
}
class triangle extends shape{
double base;
double height;
triangle(double b, double h ){
	base =b;
	height=h;
	
}
	@Override
	double getarea() {
		// TODO Auto-generated method stub
		return 0.5*base*height;
	}
	
}
class circle extends shape{
double radius ;
circle (double r){
	radius =r;
	
}
	@Override
	double getarea() {
		// TODO Auto-generated method stub
		return Math.PI*radius*radius;
	}
	
}
public class A2Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shape s1=new square(5);
		shape s2=new triangle(4,3);
		shape s3=new circle(2.5);
		System.out.println("area of the square is "+s1.getarea());
		System.out.println("the area of the triange is "+s2.getarea());
		System.out.println("the area of the circle is "+s3.getarea());
		
	}
}
*/
abstract class shape{
	abstract void getarea();
	
	
}
class circle extends shape{
int r;
circle(int r){
	this.r=r;
}
@Override
void getarea() {
	// TODO Auto-generated method stub
	System.out.println("the area of circle is "+3.14*r*r);
}
}
class triangle extends shape{
int  h;
int b;
triangle(int h,int b){
	this.h=h;
	this.b=b;
}
	@Override
	void getarea() {
		// TODO Auto-generated method stub
		System.out.println("the area of the triangle is "+0.5*b*h);
	}
	
}
public class A2Q6 {

	public static void main(String[] args) {
shape s1=new circle(3);
shape s2=new triangle(3,2);
s1.getarea();
s2.getarea();		
		
	}}