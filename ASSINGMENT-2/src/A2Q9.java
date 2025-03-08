class student{
	int roll;
	String name;
	String course;
	void input(int roll,String name,String course ){
	this.roll=roll;
	this.name=name;
	this.course=course;
	
	}
void output() {
		System.out.println("the roll ,name and course  of the person is \t"+roll+"\t"+name+"\t"+course);
	}
}
class exam extends student {
	int marks1;
	int marks2;
	int marks3;
	 void input_marks(int marks1,int marks2,int marks3) {
		 this.marks1=marks1;
		 this.marks2=marks2;
		 this.marks3=marks3;
		 
		 
	 }
	void display_result() {
		System.out.println("the marks of the students are \t"+marks1+"\t"+marks2+"\t"+marks3);
	}
}

public class A2Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
exam []e1=new exam[5];

for(int i=0;i<e1.length;i++) {
	e1[i]=new exam();
	e1[0].input(34,"gfbh","rtfbh");
	e1[0].input_marks(32,23,32);
	
	e1[1].input(43,"rtg","brg");
	e1[1].input_marks(43,34,4);
	e1[2].input(34,"gfb","trg");
	e1[2].input_marks(43,34,32);
	e1[3].input(33,"grtg","fdg");
	e1[3].input_marks(43,1,43);
	e1[4].input(3, "fdd", "fdf");
	e1[4].input_marks(23, 42, 43);
}
for(int i=0;i<e1.length;i++) {
	e1[i].output();
	e1[i].display_result();
	
}


	}

}
