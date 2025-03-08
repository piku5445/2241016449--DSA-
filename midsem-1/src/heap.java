import java.util.*;
public class heap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the size of the array");
int n=sc.nextInt();

int[]ar=new int[n];
System.out.println("enter the value of array");

for(int i=0;i<ar.length;i++) {
	ar[i]=sc.nextInt();
	
}

System.out.println("the required buid heap will be ");

heapify(ar,n,2);
	}
	public static void heapify(int []ar,int n,int i) {
		int largest=i;
		int l=2*i;
		int r=2*i+1;
				if(l<n&&ar[l]>ar[largest]) {
					largest=l;
				}
				 if(r<n&&ar[r]>ar[largest]) {
					largest=r;
				}
				 if(largest!=i) {
					swap(ar,i,largest);
					heapify(ar,n,largest);
				}
	}
	public static void swap(int ar[],int i,int largest) {
		int temp=0;
		ar[temp]=ar[i];
		ar[i]=ar[largest];
		ar[largest]=ar[temp];
	}
	
	}



