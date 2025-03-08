package queue;

public class queue2 {
static  class  queue{
	static int arr[];
	static int size ;
	static int rear=-1;
	queue(int n){
		arr=new int[n];
		this.size=n;
		
	}
	public static boolean isempty() {
		return rear==-1;
	}
	//enqueue
	public static void add(int data) {
		if(rear==size-1){
		System.out.println("overflowing condition");	
		return;
		}
		rear++;
		arr[rear]=data;
		
	}
	//dequeue
	public static int remove() {
		if(isempty()) {
			System.out.println("it is empty");
			return-1;
		}
		
		int front=arr[0];
		for(int i=0;i<rear;i++) {
			arr[i]=arr[i+1];
			
		}
		rear--;
		return front;
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
queue2 q=new queue2();
q.add();


	}

}
