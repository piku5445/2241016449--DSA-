class destination{
	int meters;
	int centimeters;
	destination(int meters,int centimeters) {
		this.meters=meters;
		this.centimeters=centimeters;
		
		
	}
	void display() {
		System.out.println(meters+" m "+ centimeters+" cm");
	
	}
	public 	destination sum(destination d1,destination d2) {
	
	int tot_dis=d1.meters+d2.meters;
	int tot_dis2=d2.centimeters+d2.centimeters;
if(tot_dis2>=100) {
		tot_dis+=tot_dis2/100;
		tot_dis2=tot_dis%100;
	}
	return new destination(tot_dis,tot_dis2);
	
	}
}
public class HAQ3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
destination d1=new destination(1,3);


destination d2=new destination(2,43);

destination d3=d1.sum(d1,d2);
d3.display();

	}

}
