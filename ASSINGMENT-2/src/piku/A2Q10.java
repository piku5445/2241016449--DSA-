package piku;
class student{
	String name;
	int roll;
	void input(String name,int roll) {
		this.name=name;
		this.roll=roll;
		
	}
	void output() {
		System.out.println("name \t"+name+ "roll \t"+roll);
	}
	
	
}	
	class test extends student{
		int marks1;
		int marks2;
		int marks3;
		void input(int marks1,int marks2,int marks3) {
			this.marks1=marks1;
			this.marks1=marks2;
			this.marks3=marks3;
		}
		void output() {
			System.out.println("the marks1 \t"+marks1+"\t1"+marks2+"\t"+marks3);
		}
	} 
	class A2Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
test t1=new test();
void 
	}

}
