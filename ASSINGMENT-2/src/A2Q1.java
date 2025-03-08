import java.util.Scanner;
class phone{
	
	 int  area_code;
	 int exchange;
	 long number;
	 void putdata(int area_code,int exchange,int number) {
		this.area_code=area_code;
		this.exchange=exchange;
		this.number=number;
		
	 }
void getdata() {
	System.out.println("("+area_code+") "+exchange+"-"+number);
	
}}


public class A2Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
phone p1=new phone();
phone p2=new phone();
System.out.println("my number");
p1.putdata(212, 767, 8900);
p1.getdata();
System.out.println("your number");

p2.putdata(415, 555, 1212);
p2.getdata();
	}

}
