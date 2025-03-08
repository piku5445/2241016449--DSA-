
public class DP5 {
	static int [] ar;
static int front=0;
static int rear=-1;
static int max=5;
DP5(){
	ar=new int[max];
			
}
public static void insert(int x) {
	

	if(rear==max-1) {
		System.out.println("over flow codition ");
	}
	else {
		rear++;
		ar[rear]=x;
	}
}
public static void del() {
	if(front>rear) {
			System.out.println("under flow condition"); 
	}
	else {
		front=front+1;
	}
}
public static void display() {
	if(front>rear) {
		System.out.println("under flow condition");
	}
	else {
		for(int i=front;i<=rear;i++) {
			System.out.println(ar[i]+" ");
		}
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DP5 a=new DP5();
a.insert(6);
a.insert(3);
a.insert(5);
a.display();
a.del();
a.display();
	}

}
