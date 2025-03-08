import java.util.*;
import java.util.ArrayList;

public class cf1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> student =new ArrayList();
student.add("rakesbh");
student.add("piku");
student.add("nikita");
student.add("shruti");
student.add("muskan");
//size=n
//n+n/2+1
System.out.println(student);
student.add(1,"ok");
System.out.println(student);
ArrayList<String>list=new ArrayList();
list.add("feg");
list.add("fvr");
list.addAll(student);
System.out.println(list);
System.out.println(list.get(1));
list.remove(1);
System.out.println(list);
//list.remove(Integer.valueOf("feg"));
System.out.println(list);
//list.clear();
list.set(2, "okjannu");
System.out.println(list);
list.contains("pdf");
for(int i=0;i<list.size();i++) {
	System.out.println("the element is "+list.get(i));
}
for(String element:list) {
	System.out.println("foreach elements is "+element);
}
Iterator<String>it=list.iterator();
while(it.hasNext()) {
	System.out.println("iterator "+it.next());
}
	}

}
