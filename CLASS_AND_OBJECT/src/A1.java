import java.util.ArrayList;
public class A1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {4,7,1,0};
		int n=4;
		ArrayList<Integer> ans=leader_O( arr);
		for(int i=0;i<ans.size();i++) {
			System.out.print(ans.get(i)+" ");
		}

	}
	static ArrayList<Integer> leader_O(int a[]) {
		ArrayList<Integer> ans=new ArrayList<>();
		int n=a.length;
		int max=a[n-1];
		ans.add(max);
		for(int i=n-2;i>=0;i--) {
			if(a[i]>max) {
				ans.add(a[i]);
				max=a[i];
			}
		}
		return ans;
	}

}
