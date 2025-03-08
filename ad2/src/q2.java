import java.util.*;
public class q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v=5;
		
ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
for(int i=0;i<=v;i++) {
	adj.add(new ArrayList<>());
}
	
	adj.get(0).add(2);
    adj.get(2).add(0);
    adj.get(0).add(1);
    adj.get(1).add(0);
    adj.get(0).add(3);
    adj.get(3).add(0);
    adj.get(2).add(4);
    adj.get(4).add(2);
   
   

ArrayList<Integer> ans=bfs(adj,v);
for(int i=0;i<=ans.size();i++) {
	System.out.println(ans.get(i));
}
	}
public static ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj,int v) {
	Queue<Integer> q=new LinkedList<Integer>();  
	ArrayList<Integer> s=new ArrayList<>();
	boolean [] visited=new boolean[v];
	q.add(0);
	visited[0]=true;
	while(!q.isEmpty()) {
		
		int p=q.poll();
		s.add(p);
		for(Integer it:adj.get(p)) {
			if(visited[it]==false) {
				visited[it]=true;
				q.add(it);
				
			}
		}
	}
	return s;
}
}
