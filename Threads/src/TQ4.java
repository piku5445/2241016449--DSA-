import java.util.*;
class test4 extends Thread{
	@Override
	public void run() {
		System.out.println("thread task");
	}
}
class test2 extends Thread{
	public void run()
	{
		System.out.println("task2 ");
	}
}
public class TQ4 {

	public static void main(String[] args) {
		//Main Thread
		// TODO Auto-generated method stub
		test4 t=new test4();
	
		t.start();
		test2 t1=new test2();
		t1.start();
	}

}
