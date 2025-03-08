package tree;
import java.util.*;

public class bfs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		    ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
		    for (int i = 0; i < 5; i++) {
		        adj.add(new ArrayList<>());
		    }
		    adj.get(0).add(1);
		    adj.get(1).add(0);
		    adj.get(0).add(4);
		    adj.get(4).add(0);
		    adj.get(1).add(2);
		    adj.get(2).add(1);
		    adj.get(1).add(3);
		    adj.get(3).add(1);
		    
		    
		    ArrayList<Integer> ans = bfstraversal(adj, 5);
		    for (int i = 0; i < ans.size(); i++) {
		        System.out.print(ans.get(i) + " "); 
		    }
		}

	
public static ArrayList<Integer> bfstraversal(ArrayList<ArrayList<Integer>>adj , int V ){
	ArrayList<Integer> ans=new ArrayList<>();
	Queue<Integer> q=new LinkedList<>();
	boolean []visited=new boolean [V];
	q.add(0);
	visited[0]=true;
	while(!q.isEmpty()) {
		 Integer node=q.poll();
		 ans.add(node);
		 for(Integer it:adj.get(node)) {
			 if(visited[it]==false) {
				 visited[it]=true;
				 q.add(it);
			 }
		 }
		 
	}
	return ans;
	
}
}
