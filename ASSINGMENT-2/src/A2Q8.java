interface detailinfo{
	void display();
	void count();
	
}
class person1 implements detailinfo{
static int maxcount;
String name;
person1(String name){
	this.name=name;
}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("name " +name);
	}

	@Override
	public void count() {
		// TODO Auto-generated method stub
		int count =0;
		for(int i=0;i<name.length();i++) {
			count =count +1;
		}
		System.out.println(count);
	}
	
}
public class A2Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		person1 p1=new person1("piku");
		p1.display();
		System.out.println("the number of charater are\t");
		p1.count();
		

	}

}
