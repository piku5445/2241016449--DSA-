import java.util.*;
public class Nby3majorityelement2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []ar= {11,33,33,11,33,11};
System.out.println(optimalmoores(ar));
	}
	public static ArrayList<Integer> optimalmoores(int ar[]) {
		int  count1=0;
		int count2=0;
		
		int ele1=Integer.MIN_VALUE;;
		int ele2=Integer.MIN_VALUE;;
		
		int min=ar.length/3+1;
		for(int i=0;i<ar.length;i++) {
					if(count1==0&&ele2!=ar[i]) {
						count1=1;
						ele1=ar[i];
						
					}
					else if(count2==0&&ele1!=ar[i]) {
						count2=1;
						ele2=ar[i];
					}
					else if(ar[i]==ele1){
						count1++;
					}
					else if(ar[i]==ele2) {
						count2++;
					}
					else {
						count1++;count2--;
					}
		}
		ArrayList<Integer> list=new ArrayList<>();
		int cnt1=0;int cnt2=0;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]==ele1) {
				cnt1++;
			}
			if(ar[i]==ele2) {
				cnt2++;
			}
		}
		if(cnt1>=min) {
			list.add(ele1);
			
		}
		if(cnt2>=min) {
			list.add(ele2);
		}
		return list;
		
	}

}
