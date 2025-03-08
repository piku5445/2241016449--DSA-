class generics <T>{
	T name;
	
generics(T name){
	this.name=name;
}

void getdata() {
	System.out.println("the name of the given data is"+name);
}
}
public class P9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
generics<Integer> b1=new generics<Integer>(8);
b1.getdata();

	}

}
