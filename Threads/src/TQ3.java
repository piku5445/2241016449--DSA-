class test implements Runnable{
@Override
	public void run() {
	System.out.println("thread task");
}


}
public class TQ3 {
public static void main(String[]args ) {
	test t=new test();
	Thread th=new Thread(t);
	th.start();
}
}
// this  is a better way because multiple inheritance is not supported by java 