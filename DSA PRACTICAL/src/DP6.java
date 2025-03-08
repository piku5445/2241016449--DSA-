class person{
	String name;
	int age;
	person(String name,int age){
		this.name=name;
		this.age=age;
		
	}
	void getdata() {
		System.out.println("the name is"+name+"the age is"+age);
		
	}
	
}
class employee extends person{
int Eid;
double salary;
	employee(String name, int age,int Eid,double salary) {
		super(name, age);
		// TODO Auto-generated constructor stub
		this.Eid=Eid;
		this.salary=salary;
		
	}
	
	void empdisplay() {
		System.out.println("the employee id is"+Eid+"salary is "+salary);
	}
}
public class DP6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
employee e1=new employee("piku", 23, 23, 21);

	}

}
