import java.util.Stack;

public class cf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Stack<String> animals=new Stack<>();
animals.push("lion");
animals.push("horse");
animals.push("dog");
animals.push("cat");
System.out.println("stack "+animals);
System.out.println("peek "+animals.peek());
animals.pop();
System.out.println("peek "+animals.peek());


	}

}
