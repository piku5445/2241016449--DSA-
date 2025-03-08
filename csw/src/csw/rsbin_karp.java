package csw;
import java.util.*;
public class rsbin_karp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String ar[] ={"c","c","a","c","c","a","a","e","d","b","a"}
;
System.out.println(Try(ar,"d b a"));
	}
public static String Try(String ar[] ,String l){
	for(int i=0;i<ar.length;i++) {
		for(int j=i+1;j<ar.length;j++) {
			for(int k=j+1;j<ar.length;j++) {
				if(ar[i].hashCode()+ar[j].hashCode()+ar[k].hashCode()==l.hashCode()) {
					return "the pair is present ";
				}
			}
		}
	}
	return "the pair is not present";
}
}
