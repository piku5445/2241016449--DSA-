
public class P13 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method
		 int ar[]= {1,3,4,5,6,7,8};
		System.out.println("the elemnt is "+ search(ar,4));

	}
	public static int search(int[]num ,int target) {
		int flag=0;int i=0;
		for( i=0;i<num.length;i++) {
			if(num[i]==target){
			flag++;	
			break;
			}
			}
		if(flag==1) {
			System.out.println("the target is at index "+i);
			return target;
		}
		else
			return -1;
	

}}
