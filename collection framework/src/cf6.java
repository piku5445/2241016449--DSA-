import java.util.*;
public class cf6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector list=new Vector();
		list.add("piku");
		list.add("piku_pranjal");
		list.add("shruti");
		list.add("muskan");
		System.out.println("the given vector is "+list);
		list.insertElementAt("nikita", 2);
		System.out.println("the given list is"+list);
		System.out.println(list.remove(1));
		System.out.println(list);

	}

}
