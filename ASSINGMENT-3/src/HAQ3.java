
public class HAQ3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="racecar";
int j=s.length()-1;
int i=0;
System.out.println(ispall(s,0,j));
	}
public static boolean ispall(String s,int i,int j) {
	if(i==j) 
		return true;	
	else if(s.charAt(i)!=s.charAt(j)) {
		return false;
	}
	else if(i<j)
		
		return(ispall(s,i+1,j-1));
		return true;
	
}
}
