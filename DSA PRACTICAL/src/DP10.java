import java.util.LinkedList;
import java.util.Queue;

abstract class animal{
	void makesound() {
		
	}
}
class dog extends animal{
	void makesound() {
		System.out.println("bhow bhow ");
	}
}
class cat extends animal{
	void makesound() {
		System.out.println("meow meow");
	}
}
public class DP10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Queue<animal>aq=new LinkedList<>();
aq.add(new dog());
aq.add(new cat());
aq.add(new dog());
while(!aq.isEmpty()) {
	animal ani=aq.poll();
	ani.makesound();
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
