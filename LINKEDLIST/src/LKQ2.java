class node{
	public static int info;
	int data;
	node next;
	node(int data){
		this.data=data;
	}
	public static void display(node head) {
		
		node temp=head;
		
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
			
		}
		
	}
	void insertatend(int val) {
		node head=null;
		node tail=null;
		node temp=new node(val)
;
		if(head==tail) {
	head=temp;
	tail=temp;
	
	
}
else {
	tail.next=temp;
	tail=temp;
	
}
	}
}

public class LKQ2 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
node a=new node(2);
//System.out.println(a);//node@2c7b84de
//System.out.println(a.next);
node b=new node(3);
node c=new node(8);
a.next=b;
b.next=c;
/*
System.out.println(a.next);//node@3fee733d
System.out.println(b);//node@3fee733d
System.out.println(c);//node@5acf9800
System.out.println(a.next.next.data);
System.out.println("start from here");

/*for(int i=0;i<=2;i++) {
	System.out.println(temp.data);
	temp=temp.next;
}
*/
//Displying the linklist

node.display(a);

	
	
	}


}
