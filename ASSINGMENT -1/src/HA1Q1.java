import java.util.Scanner; 
class po{
	int we;
	int rt;
void input(){
		
		Scanner sc=new Scanner(System.in);
		int we=sc.nextInt();
		int rt=sc.nextInt();
		
		
	}
	void get() {
		System.out.println(we);
		System.out.println(rt);
	}
	
}
public class HA1Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

po []e1=new po[2];
for(int i=0;i<2;i++) {
	e1[i]= new po();
	e1[i].input();
}
for(int i=0;i<2;i++)
e1[i].get();
	}

}
