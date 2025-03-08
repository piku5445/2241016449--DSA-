class commission{
	double sales;
	commission(double sales){
		this.sales=sales;
		
	}
	public double getcommission() {
		if(sales<0) { 
			System.out.println("in valid sales");
		
	}
		else if(sales<100)
			
	return 2/100*sales;
		
		else if (sales<500&&sales>5000)
			return 5/100*sales;
		else if(sales>5000) 
			return 8/100*sales;
		return sales;
		
	}
}



public class HAQ1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  commission c1=new commission(600);
  System.out.println(c1.getcommission());
  commission c2=new commission(3423);
  System.out.println(c2.getcommission());
  
	}

}
