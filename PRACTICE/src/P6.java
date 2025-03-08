class student{
	int roll;
	String name;
	int dsamarks;
void getdata(int roll,String name,int dsamarks) {
	this.roll=roll;
	this.name=name;
	this. dsamarks=dsamarks;
	
	
}
void showdata() {
	System.out.println("roll"+roll+"\t"+"name \t"+name+"\t dsamarks"+dsamarks);
}
}
public class P6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student p1=new student();
student []ar=new student[3];
int max=-1;
int index =-1;
for(int i=0;i<3;i++){
ar[i] =new student();
	ar[0].getdata(23, "324", 435);
	ar[1].getdata(43, "rter", 4);
	ar[2].getdata(33, "34", 4);
	
}


for(int i=0;i<3;i++) {
	ar[i].showdata();
}
	}
	
}
