import java.util.*;

public class P1 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner (System.in);
System.out.println("enter the number ");
int n=sc.nextInt();

int ar[]=new int[n];
for(int i=0;i<ar.length;i++) {
	ar[i]=sc.nextInt();

}

QS(ar,0,ar.length-1);
System.out.println("the sorted array will be ");
display(ar);
	}
public static void QS(int arr[],int low,int high) {
	if(low<high) {
		int pivot=partition(arr,low ,high);
		QS(arr,low,pivot-1);
		QS(arr,pivot+1,high);
	}
}

public static int partition(int[] ar, int low, int high) {
    int pivot = ar[low];
    int i = low + 1;
    int j = high;

    while (i <= j) {
        while (i <= high && ar[i] < pivot) {
            i++;
        }
        while (j > low && ar[j] > pivot) {
            j--;
        }
        if (i <= j) {
            swap(ar, i, j);
        }
    }

    swap(ar, low, j);
    return j;
}

	
public static void swap(int[] ar, int i, int j) {
    int temp = ar[i];
    ar[i] = ar[j];
    ar[j] = temp;
}

public static void display(int ar[]) {
	for(int i=0;i<ar.length;i++) {
		System.out.println(ar[i]);
	}
}
}
