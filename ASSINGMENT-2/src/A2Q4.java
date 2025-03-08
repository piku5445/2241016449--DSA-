class product
{
	String pid;
	double price;
	product(String pid,double price){
		this.pid=pid;
		this.price=price;
		
	}
	void display() {
		System.out.println("The Product ID is "+pid);
		System.out.println("The Product Price is"+price);
	}
	public static double total(product[]ar) {
		double totalprice=0;
		for(int i=0;i<5;i++) {
		totalprice=totalprice+ar[i].price;	
		}
		return totalprice;
	}
}
public class A2Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
product[]p1=new product[5];

for(int i=0;i<5;i++) {
	
	p1[0] =new product("31",77);
	p1[1]=new product("32",12);
	p1[2]=new product("33",34);
	p1[3]=new product("34",23);
	p1[4]=new product("35",34);

}
for (int i=0;i<p1.length;i++) {
	p1[i].display();
}
double res= product.total(p1);
System.out.println("the total price of the product is"+res);

	}

}
