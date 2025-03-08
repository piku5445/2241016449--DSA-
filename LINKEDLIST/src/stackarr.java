
public class stackarr {
	final static int max=5;
	static int stack []= {6,9,0,7};
	static int top=-1;
	stackarr(){
		stack=new int [max];
		
	}
	public static void push(int x) {
		if(top==max-1) {
			System.out.println("overflow condition");
		}
		else {
			top++;
			stack[top]=x;
			
		}
	}
public static void pop() {
	if(top==-1) {
		System.out.println("underflow condition");
	}
	else {
		top=top-1;
		
	}
}
public static void display() {
	System.out.println("stack ");
	for(int i=top;i>0;i--) {
		System.out.println(stack[i]+" ");
		
	}
	System.out.println("\n top ="+top);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
push(8);
display();

	}

}
public class Stack_Array_Representation {
    final int max = 5;
    int []ar ;
    int Top =-1;
    Stack_Array_Representation() {
        ar = new int[max];
    }
        void push ( int x){
            if (Top == max - 1) {
                System.out.println("Overflow condition!....");
            }
            else {
                Top++;
                ar[Top] = x;
            }
        }
        void pop(){
        if (Top==-1){
            System.out.println("Underflow condition!....");
        }
        else {
            Top--;
        }
        }
        void display(){
        if (Top==-1){
            System.out.println("underflow condition!....");
        }
        else {
            for (int i =Top;i>=0;i--){
                System.out.print(ar[i]+"-->");
            }
        }
        }
        public static void main (String[]args){
            Stack_Array_Representation obj = new Stack_Array_Representation();
            obj.push(10);
            obj.push(20);
            obj.push(30);
            obj.push(40);
            obj.display();
            System.out.println();
            obj.pop();
            obj.pop();
            System.out.println();
            obj.display();
        }
    }