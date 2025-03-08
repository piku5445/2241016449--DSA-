package exception_handling;


class comp<T1,T2>{//type parameter
T1 a;
T2 b;

comp(T1 a,T2 b){
	this.a=a;
	this.b=b;
}
void getdata() {
	System.out.println(a+" "+b);
}}
public class CQ4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
comp<Integer,Double> c1=new comp<Integer,Double>(10,10.5);
c1.getdata();


	}

}


			


