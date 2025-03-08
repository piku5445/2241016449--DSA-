class mythreadrunnable implements Runnable{
	public  void run() {
		while(true)
		System.out.println("i am a thread not a threats");
	}
}
class mythreadrunnable2 implements Runnable{
	public void run() {
		while(true)
		System.out.println("i am thread2 not a threats");
	}
}
public class TQ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mythreadrunnable bullet=new mythreadrunnable();
		Thread gun1=new Thread(bullet);
		
		 mythreadrunnable2 bullet2=new  mythreadrunnable2();
		 Thread gun2 =new Thread(bullet2);
		 gun1.start();//we cant use start because  in bullet
		 gun2.start();

	}

}
