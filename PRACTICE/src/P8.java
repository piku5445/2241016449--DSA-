class product{
	int pid;
	int price;
	static int tot_price;
	product(int pid,int price){
		this.pid=pid;
		this.price=price;
		
	}
	void display(){
		System.out.println(pid);
System.out.println(price);

	}
	public static int sumprice(product []ar) {
		int sum=0;
		for(int i=0;i<5;i++) {
			tot_price=tot_price+ar[i].price;
		}
		return tot_price;
	}
	
}
public class P8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
product []ar=new product[5];
ar[0]=new product(23,34);
ar[1]=new product(33,23);
ar[2]=new product(32,34);
ar[3]=new product(32,34);
ar[4]=new product(32,45);
for(int i=0;i<5;i++) {
	ar[i].display();
	
}
int totalprice=product.sumprice(ar);
	System.out.println(totalprice);
	}

}
