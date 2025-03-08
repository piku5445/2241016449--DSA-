class book{
	String BName;
	int BEdition;
	double BPrice;
	book(String BName,int BEdition,double BPrice){
		this.BName=BName;
		this.BEdition=BEdition;
		this.BPrice=BPrice;
		
	}
	void display(){
		System.out.println("the book name \t "+BName+" book edition \t "+BEdition+" book price \t "+this.BPrice);
	}
	public static double max(book[]ar) {
		double max= ar[0].BPrice;
		for(int i=0;i<ar.length;i++) {
			if(max<ar[i].BPrice) {
				max=ar[i].BPrice;
				
			}
			
		}
		return max;
	}
}
public class HAQ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
book[] b1=new book[5];
for(int i=0;i<b1.length;i++) {

	b1[0]=new book("erwe",32,324);
	b1[1]=new book("harry potter",6,343);
	b1[2]=new book("piku",2,234);
	b1[3]=new book("asique",6,242);
	b1[4]=new book("pagal",10,1000);
}
for(int i=0;i<b1.length;i++) {
	b1[i].display();	
}
double res= book.max(b1);
System.out.println("THE MAXIMUM PRICE OF THE BOOK IS "+ res );
	}

}
