import java.util.*;
public class mergesortedarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
int ar1[] ={1, 4, 8, 10};
int ar2[]={2, 3, 9};
brute(ar1,ar2);
System.out.print("ar1[]= ");
for(int i=0;i<ar1.length;i++) {
	System.out.print(ar1[i]+ " ");
}
System.out.print("\nar2[]= ");
for(int i=0;i<ar2.length;i++) {
	System.out.print(ar2[i]+ " ");

}
	}
public static void brute(int ar1[],int ar2[]){
int a =ar1.length;
int b=ar2.length;
int i=0;
int j=0;
int ar3[] = new int[a+b];
int k=0;
while(i<a&&j<b) {
	if(ar1[i]<ar2[j]) {
		ar3[k]=ar1[i];
		i++;k++;
		
		
	}
	else {
		ar3[k]=ar2[j];
		j++;
		k++;
		
	}}
	 while(j<b) {
     	ar3[k]=ar2[j];
     	k++;
     	j++;
     	
     }
     while(i<a) {
     	ar3[k]=ar1[i];
     	i++;
     	k++;
     	
     }
     for(i=0;i<a+b;i++) {
    	 if(i<a) {
    		 ar1[i]=ar3[i];
    		 
    	 }
    	 else
    		 ar2[i-a]=ar3[i];
    	 
     }
     
}

}

