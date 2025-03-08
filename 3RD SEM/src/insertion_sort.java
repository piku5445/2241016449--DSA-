
public class insertion_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//INSERTION SORT IN JAVA
int ar[]= {8,4,1,5,9,2};
for(int i=1;i<ar.length;i++) {
	int temp=ar[i];
	int j=i-1;
	while(j>=0&&ar[j]>temp) {
		ar[j+1]=ar[j];
		j--;
	}
	ar[j+1]=temp;
	
}

for(int i=0;i<ar.length;i++) {
	System.out.println(ar[i]);
}
	}

}
