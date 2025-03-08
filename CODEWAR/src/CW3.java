import java.util.*;
public class CW3 {

		public static void main(String[] args) {
		
			ArrayList<Integer>l1=new ArrayList<>();
			ArrayList<Integer>l2=new ArrayList<>(5);
			l2.add(67);
			l2.add(47);
			l2.add(45);
			l1.add(6);
			l1.add(0);
			l1.add(5);
			l1.add(5);
			l1.add(1,7);//This  the element 7 in index .
			l1.add(4,8);
			l1.addAll(l2);//This helps to add another List in Existing List.
			System.out.println(l1.contains(78));//It tells that Element is Present or not.
			System.out.println("it tell about The Index of Particular Element "+l1.indexOf(0));
			System.out.println("It tell the Last index of element "+ l1.lastIndexOf(6));
					for(int i=0;i<l1.size();i++) {
			System.out.println(l1.get(i));//To Get the element
					}

			}

	}


