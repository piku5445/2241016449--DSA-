import java.util.Scanner;
class node1{
	int info;
	node1 next;
	
	
}
public class LKQ5 {
 
	 static Scanner sc=new Scanner(System.in);
	static node1 start=null;
	public static void create(node1 link){
		
	System.out.println("enter the value of node ");	
     
     link.info=sc.nextInt();
     link.next=null;
     System.out.println("enter the 0 to exist or any other key of the to continue");
     int x=sc.nextInt();
     while(x!=0) {
    	 node1 curr=new node1();
    	 System.out.println("enter the value of current node");
    	 curr.info=sc.nextInt();
    	 curr.next=null;
    	 link.next=curr;
    	 link=curr;
    	 System.out.println("enter the 0 to exist or any other key to continue ");
    	 x=sc.nextInt();
    	 
     }
     
     
	}
	public static  void insbeg(node1 link) {
 		// TODO Auto-generated method stub
 		node1 temp=new node1();
 		System.out.println("enter the value of node");
 		temp.info=sc.nextInt();
 		
 		temp.next=null;
 		temp.next=link;
 		start=temp;
 	
 		
 	}
	public static void inend(node1 link ) {
		node1 temp=new node1();
		System.out.println("enter the value");
		temp.info=sc.nextInt();

	while(link.next!=null) {
		link=link.next;
	}
	link.next=temp;
	temp.next=null;
	
/*	for(int i=0;i<3;i++) {
if(link.next==null) {
	
	link.next=temp;
	temp.next=null;
}
	else {
		link=link.next;
		
	}}
	*/
	}
	public static void inany(node1 link,int pos) {
		node1 temp=new node1();
		System.out.println("enter the information ");
		temp.info=sc.nextInt();
		temp.next=null;
		if(pos==1) {
			temp.next=link;
			start=temp;
		}
		else {
			int i=1;
			node1 prev=new node1();
			while(i<pos) {
				prev=link;
				link=link.next;
				i++;
			}
			prev.next=temp;
			temp.next=link;
			
			
		}		
	}
	public static void delatbeg(node1 link) {
		start=link.next;
		
	}
	public static void delatend(node1 link) {
		node1 prev=new node1();
		
		while(link.next!=null) {
			prev=link;
			link=link.next;	
		}
		prev.next=null;
		
	}
	public static void delatany(node1 link,int loc ) {
	
		System.out.println("enter the posistion to delete ");
		if(loc==1) {
			start=link.next;
			
		}
		else {
			int i=0;
			node1 prev=new node1();
			while(i<loc) {
				prev=link;
				link=link.next;
				i++;
				
			}
			prev.next=link.next;
		}
	}
	
	static void display(node1 link) {
		int c=0;
		System.out.println("the value of the element are given by ");
   	 while(link!=null) {
   		 System.out.print(link.info+"  ");
   		 link=link.next;
   		 c++;
   	 }
   	 System.out.println("the number of element will be "+ c);
    }
public static boolean search(node1 link) {
	System.out.println("enter the search key ");
	int key=sc.nextInt();
	int flag=0;
	while(link!=null) {
		if(node.info==key) {
			flag++;
		}
		link=link.next;
	}
	if(flag==1) {
		System.out.println("the element is present");
		return true;
	}
	else {
		System.out.println("the element is not present ");
		return false;
	}
}
public static void sort(node1 link) {
	node1 ptr1=new node1();
	node1 ptr2=new node1();
	for(ptr1=link;ptr1.next!=null;ptr1=ptr1.next)
	for(ptr2=ptr1.next;ptr2!=null;ptr2=ptr2.next) {
		if(ptr2.info<ptr1.info) {

		    int t=ptr1.info;
			ptr1.info=ptr2.info;
			ptr2.info=t;
		}
	}}
public static void count(node1 link) {
	int c=0;
	
	 while(link!=null) {
		 
		 link=link.next;
		 c++;
		
	 }
	 System.out.println(c);
}
// to display the java code using reccursion
public static void display2(node1 link) {
	if (link==null) {
		return;
	}
	else {
		System.out.println(link.info);
display2(link=link.next);


	}
}
public static void swap(node1 link) {

	node1 temp=new node1();
	int p=link.info;
	node1 last=new node1();
	node1 first=link;
	
while(link.next!=null) {
	link=link.next;
	last=link;
}
first.info=last.info;
last.info=p;

}
public static node1 reverse(node1 link) {
	node1 curr=link;
 node1 prev=null;
	while(curr!=null) {
		node1 temp=curr.next;
		curr.next=prev;
		prev=curr;
		curr=temp;
	}
	return prev;
}
 	public static void main(String[] args) {
		// TODO Auto-generated method stub
node1 link=new node1();
 start = link;
 System.out.println("to create the link");
//create(start);
//display2(start);
//System.out.println("insertion in beginning will be ");
//insbeg(start);

//display(start);
//inend(start);
//System.out.println("insertion at end would be");
//display(start);
//System.out.println("enter the position ");
//int pos=sc.nextInt();
//inany(start,pos);
//System.out.println("insertion at any position would be ");
//display(start);
///System.out.println("delet the element in position first ");
//delatbeg(start);
//display(start);

//System.out.println("delet the element present in any position ");
//delatany(start, 3);
//display(start);
//System.out.println("the sorted element will be given by ");
//sort(start);
//display(start);
// System.out.println("to swap the link");
 //swap(start);
// display2(start);
while(true) {
	System.out.println("***menu***");
	System.out.println("0:exit");
	System.out.println("1:creation");
	System.out.println("2:display");
	System.out.println("3:insert at beg");
	System.out.println("4:insert at end ");
	System.out.println("5:inser at any position");
	System.out.println("6:delete at begining");
	System.out.println("7:delete at end ");                              
	System.out.println("8:delete at any position");
	System.out.println("9:sorting at any position ");
	System.out.println("10:searching");
	System.out.println("11:count");
	System.out.println("12:swap");
	System.out.println("13:reverse of linklist");
	System.out.println("enter the choice");
	int choice=sc.nextInt();
	switch(choice) {
	case 0:
		System.out.println("to exit");
		break;
	case 1:
		
		create(start);
		break;
	case 2:
		display(start);
		break;
	case 3:
		System.out.println("insertion in beginning will be ");
		insbeg(start);
	    
	    break;
	    
	case 4:
	   System.out.println("insertion at end would be");
		inend(start);
		display(start);
		break;
		//display(start);
	case 5:
		
		System.out.println("enter the position ");
		int pos=sc.nextInt();
		System.out.println("insertion at any position would be ");
		inany(start,pos);
		display(start);
		break;
		//display(start);
	case 6:
		System.out.println("delete the element in position first ");
		delatbeg(start);
		display(start);
		break;
		//display(start);
	case 7:
		System.out.println("delete the element present in any position ");
		delatany(start, 3);
		display(start);
		break;
		//display(start);
	case 9:
		System.out.println("the sorted element will be given by ");
		sort(start);
		display(start);
		break;
		//display(start);
	case 8:
		System.out.println("delet at end ");
		delatend(start);
		display(start);
		break;
		
	case 10:
		System.out.println("searching the element");
		search(start);
		display(start);
		break;
	case 11:
		System.out.println("the element to count");
		count(start);
		display(start);
		break;
	case 12:
		System.out.println("the element to be swap ");
		swap(start);
		display(start);
		break;
	case 13:
		reverse(start);
		display2(start);
		break;
		
			
		default:
			System.out.println("wrong choice"); 
}	
}
}
}

 
 	
