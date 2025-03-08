package tree;
import java.util.*;
class node2{
	node2 left;
	node2 right;
	int data;
	node2( int data) {
	
		left=right=null;
		this.data = data;
	}
}
public class binarytree2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public static List<List<Integer>> getTreeTraversal(node2 root) {
		 List<List<Integer>> wraplist = new LinkedList<List<Integer>>();
		 if(root==null) {
			 return null;
		 }
		 
	      Queue<node2> queue=new LinkedList<>();
	      
	      queue.offer(root);
	      while(queue!=null) {
	    	  int num=queue.size();
	    	  List<Integer> sublist=new LinkedList<>();
	    	  for(int i=0;i<num;i++) {
	    		 node2 curr=queue.poll();
	    		 wraplist.add(sublist);
	    	  }
	    	  
	    	  
	      }
	      
	        
	    }
}
