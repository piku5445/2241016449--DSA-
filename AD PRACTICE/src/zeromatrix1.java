import java.util.*;
public class zeromatrix1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
	        matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1)));
	        matrix.add(new ArrayList<>(Arrays.asList(1, 0, 1)));
	        matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1)));

	        int n = matrix.size();
	        int m = matrix.get(0).size();

	        ArrayList<ArrayList<Integer>> ans = brute(matrix, n, m);

	        System.out.println("The Final matrix is: ");
	        for (ArrayList<Integer> row : ans) {
	            for (Integer ele : row) {
	                System.out.print(ele + " ");
	            }
	            System.out.println();
	        }
		
	}
public static  ArrayList<ArrayList<Integer>> brute(ArrayList<ArrayList<Integer>> matrix,int m,int n){
	for(int i=0;i<m;i++) {
		for(int j=0;j<n;j++) {
			if(matrix.get(i).get(j)==0) {
				makerow(matrix,n,m,i);
				makecol(matrix,n,m,j);
			}
		}
	}
	for(int i=0;i<m;i++) {
		for(int j=0;j<n;j++) {
			if(matrix.get(i).get(j)==-1) {
				matrix.get(i).set(j, 0);
			}
		}
	}
	return matrix;
}
private static void makecol(ArrayList<ArrayList<Integer>> matrix, int n, int m, int j) {
	// TODO Auto-generated method stub
	for(int i=0;i<n;i++) {
		if(matrix.get(i).get(j)!=0) {
			matrix.get(j).set(j, -1);
		}
	}

	
}
public static void makerow(ArrayList<ArrayList<Integer>> matrix, int n, int m, int i) {
	// TODO Auto-generated method stub
	for(int j=0;j<m;j++) {
		if(matrix.get(i).get(j)!=0) {
			matrix.get(i).set(j, -1);
		}
	}
}
}
