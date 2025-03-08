

public class recurssion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
sayhi(3);
	}
	public static void sayhi(int count) {
		System.out.println("hi");
		
		sayhi(count-1);
	}
}
