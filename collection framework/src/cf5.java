import java.util.ArrayDeque;
public class cf5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayDeque<Integer>adq=new ArrayDeque<>();
adq.offer(23);
adq.offerFirst(12);//it will add element in the head
adq.offerLast(45);
adq.offer(26);
System.out.println(adq);
System.out.println(adq.peekFirst());
System.out.println(adq.peek());
System.out.println(adq.peekLast());
System.out.println(adq.poll());//remove the element which is in head
System.out.println(adq.pollFirst());
System.out.println(adq.pollLast());
	}

}
