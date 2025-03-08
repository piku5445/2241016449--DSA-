import java.util.Arrays;
import java.util.Comparator;

class item {
    int value;
    int weight;

    public item(int value, int weight) {
        this.value = value;
        this.weight = weight;
    }
}

class itemComparator implements Comparator<item> {
  @Override
  public int compare(item a,item b) {
	 double ratio1=(double)a.value/a.weight;
	 double ratio2=(double)b.value/b.weight;
	 if(ratio1>ratio2) {
		 return -1;
	 }
	 else if(ratio1<ratio2) {
		 return 1;
		 
	 }
	return 0;
  
  }
 
}
public class q3{
	public static void main(String[]args) {
		
		item[] i= {new item(8,9),new item(3,2),new item(2,6)};
		double result=value(i, 15);
		System.out.println(result);
	}
	public static double value(item []items,int w) {
		
		int currweight=0;
		int currvalue=0;
		Arrays.sort(items,new itemComparator());
		for(item f:items) {
			if(currweight+f.weight<w) {
				currweight+=f.weight;
				currvalue+=f.value;
				
			}
			else {
				int remainig=w-f.weight;
				double value=f.value/f.weight+remainig;
			}
		}
		return currvalue;
	}
}
