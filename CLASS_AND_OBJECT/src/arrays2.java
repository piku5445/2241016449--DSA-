class student0{
	int roll;
	String name;
	double dsa_marks;
	void getdata(int roll,String name,double dsa_marks){
		this.roll=roll;
		this.name=name;
		this.dsa_marks=dsa_marks;
		}
	void showdata() {
		System.out.println("roll\t "+this.roll+"name\t "+this.name+"dsamarks\t "+this.dsa_marks);
	}
}
public class arrays2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

student0[]ar=new student0[3];
int max=-1;
int index=-1;
for(int i=0;i<ar.length;i++) {
	ar[i]=new student0();
	ar[0].getdata(34, "fdf", 90.0);
	ar[1].getdata(36, "agi", 45.0);
	ar[2].getdata(24, "fhhh", 80.0);
	
	
	
}
for(int i=0;i<ar.length;i++) {
	if(max<ar[i].dsa_marks) {
		max=(int) ar[i].dsa_marks;
		index=i;
	}
	System.out.println("roll\tName\tDsa marks");
}
System.out.println("roll\tName\tDsa marks");
for(int i=0;i<ar.length;i++) {
	ar[i].showdata();
	
}
System.out.println("the highest dsa marks have the roll "+ar[index].roll+" of "+max) ;
	}

}
