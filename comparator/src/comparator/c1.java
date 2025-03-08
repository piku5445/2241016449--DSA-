package comparator;
import java.util.*;
public class c1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<laptops> laps=new ArrayList<>();
		laps.add(new laptops("dell",16,800));
		laps.add(new laptops("apple",8,1200));
		laps.add(new laptops("asus",12,810));
		Collections.sort( laps);

	}

}
