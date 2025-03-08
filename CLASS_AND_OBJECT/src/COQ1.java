import java.util.Scanner;
class student{
	String name;
	int reg_no;
	double cgpa;
	student(String x,int y,double z) {
		
		
		System.out.println("enter the student details");
	name=x;
	reg_no=y;
	cgpa=z;
	
		
	}
  void putdata() {
		System.out.println("the name of the student is "+name);
		System.out.println("the reg_no of the student is "+reg_no);
		System.out.println("the cgpa of the student is "+cgpa);
	}
	
}
public class COQ1 {

	public static void main(String[] args) {
		student s1= new student("sachin",67,90);
		
		
		s1.putdata();
	
		
		

	}

}
