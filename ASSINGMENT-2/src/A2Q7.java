class person{
	String name;
	int age;
	public person(String name,int age){
		this.name=name;
		this.age=age;
		
	}
	
}
 class employee extends person{
	String eid;
	int salary;
	public employee(String name,int age,String eid,int salary){
		super(name,age);//super keywork is used when it we have to call the variable of constructors
		this.eid=eid;
		this.salary=salary;
		
	}
	
	void empDisplay() {
		System.out.println(name+" \t "+age+" \t "+eid +" \t "+salary);
		
	}
}
public class A2Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
employee p1=new employee("encdie",23,"edw",34);
employee p2=new employee("ewdfr",34,"rfr",43);
p1.empDisplay() ;
p2.empDisplay();
	}

}
