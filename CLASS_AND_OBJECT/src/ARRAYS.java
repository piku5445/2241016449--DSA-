import java.util.Scanner;
class show{
	String roll;
	String name;
	double dsa_marks;
	
void getdata7(String roll,String name,double dsa_marks){
	
	
	this. roll=roll;
	
	this. name=name;
	
	this. dsa_marks=dsa_marks;
	
}
void putdata() {
	System.out.println(this.roll+"\t"+this.name+"\t"+this.dsa_marks);
	
}


}
public class ARRAYS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);

System.out.println("enter the number of arrays");
int n=sc.nextInt();
double maxMarks=-1;
show[]ar=new show[3];
int index =-1;
for(int i=0;i<ar.length;i++) 
	ar[i]=new show ();

	ar[0].getdata7("30","chiku",56);
	ar[1].getdata7("31","pran",55);
	ar[2].getdata7("32","ap",58);
	
for(int i=0;i<ar.length;i++) {
	if(ar[i].dsa_marks>maxMarks) {
		maxMarks=ar[i].dsa_marks;
		
		index=i;
	}
	System.out.println("\ndetails of the student is:");
	System.out.println("roll\tName\tDsa marks");
	
}
for(int i=0;i<ar.length;i++) {
	ar[i].putdata();
}
System.out.println(ar[index].roll+"having roll no "+ar[index].roll+" has the highest dsa marks of"+maxMarks);
	}
	
}
