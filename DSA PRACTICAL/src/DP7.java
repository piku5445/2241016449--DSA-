class product{
	int pid;
	double price;
	static double tot_price;
	product(int pid,double price){
	this.pid=pid;
	this.price=price;
	
	}
	public static double cal(product[]ar) {
		tot_price=0;
for(int i=0;i<5;i++) {
	tot_price=tot_price +ar[i].price;
	}
return tot_price;
}
	
	void display() {
		System.out.println("the pid "+pid+" the price "+price);
	}
}
public class DP7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		product []p1=new product[5];
		for(int i=0;i<5;i++) {
			p1[0]=new product(9, 23);
			p1[1]=new product(3,32);
			p1[2]=new product(32,32);
			p1[3]=new product(23,12);
			p1[4]=new product(32,32);
			
		}
		for(int i=0;i<p1.length;i++) {
			p1[i].display();
		}
		System.out.println("the total price of the product is "+product.cal(p1));
		
	}
	
}
