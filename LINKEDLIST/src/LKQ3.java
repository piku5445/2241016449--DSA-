
public class LKQ3 {
public class node{
	int data;
	node next;
	node(int data){
		this.data=data;
		
	}
}
public static class linklist{
	node head=null;
	node tail=null;
	void insertatend(int val) {
	 node temp=new node(val);
	 if(head==null) {
		 head=temp;
		 tail=temp;
		 
	 }
		
	}
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
linklist l1=new linklist();
l1. badd(4);

	}

}
