
import java.util.Scanner;
class show{
	
	String roll;
	String name;
	double dsa_marks;
	void getdata7() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the information ");
		name=sc.next();
		roll=sc.next();
		dsa_marks=sc.nextDouble();
			
	}
/*	
void getdata7(String roll,String name,double dsa_marks){
	
	
	this. roll=roll;
	
	this. name=name;
	
	this. dsa_marks=dsa_marks;
	
}
*/
void putdata() {
	System.out.println(this.roll+"\t"+this.name+"\t"+this.dsa_marks);
	
}


}
public class A2Q3 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner sc=new Scanner(System.in);
System.out.println("enter the number of arrays");

double maxMarks=0;
show[]ar=new show[3];
int index =0;
for(int i=0;i<3;i++) {
	ar[i]=new show ();

/*	ar[0].getdata7("30","chiku",56);
	ar[1].getdata7("31","pran",55);
	ar[2].getdata7("32","ap",58);
	
	*/
	
	ar[i].getdata7();
}


for(int i=0;i<3;i++) {
	if(ar[i].dsa_marks>maxMarks) {
		maxMarks=ar[i].dsa_marks;
		
		index=i;
	}
	System.out.println("\ndetails of the student is:");
	System.out.println("roll\tname\tDsa marks");
	
}

for(int i=0;i<ar.length;i++) {
	ar[i].putdata();
}
System.out.println(ar[index].name+"having roll no "+ar[index].roll+" has the highest dsa marks of"+maxMarks);
	


	
	}

}
