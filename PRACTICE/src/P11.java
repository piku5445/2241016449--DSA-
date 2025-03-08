class box<T,T1>
{
T t;
T1 H;
box(T t){
	this.t=t;
	this.H=H;
	
}
void detdata() {
	System.out.println(t);
}
	
}

public class P11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
box<Integer,Double> b1=new box <Integer,Double>(56);
b1.detdata();
box<Double> b2=new box<Double>(34.0);
b2.detdata();
box<String> b3=new box<String>("piku");
b3.detdata();
	}

}
