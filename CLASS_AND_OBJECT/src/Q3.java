import java.util.Random;
import java.util.Scanner;
class guess{
	public int number;
	public int noofguess;
public int noofguess() {
	return noofguess;
}
void putnoofguess() {
	this.noofguess=noofguess;
	
}
void setnoofguess(int noofguess) {
	this.noofguess=noofguess();
}
void putdata() {
	Scanner sc=new Scanner (System.in);
	int number=sc.nextInt();
}
void game() {
	Random rand= new Random();
	int bound;
	this.number=rand.nextInt(bound : 100);
}
	
}

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
