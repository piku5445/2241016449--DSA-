
import java.util.*;
public class ishika 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the string pattern:");
		String s1=sc.next();
		System.out.println("Enter the string pattern to match:");
		String s2=sc.next();
		int n=s1.length(); int m=s2.length();
		if(n>m)
		{
			int i=0;int j=0;boolean flag=false;
		for(i=0;i<n-m+1;i++)
		{
			String s=s1.substring(i, i+m);
			//System.out.println(s);
			for(j=0;j<m;j++)
			{
				if(s.charAt(j)!=s2.charAt(j))
				{
					break;
				}	
			}
			if(j==m)
			{
				flag=true;
				System.out.println("Pattern present at:"+i);
			}
		}
		if(flag==false)
		{
			System.out.println("pattern not found");
		}
		}
		else
		{
			System.out.println("invalid matching pattern:length exceeds  string length");
		}
	}
}
//abacaabcdabacaab
//aab
