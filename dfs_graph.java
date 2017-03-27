package assignment1;

import java.util.Scanner;

public class dfs_graph {
	private int num;
	private static int num1;
	private static Scanner scan1;
	private static Scanner scan;
	public dfs_graph(int n)
	{
	this.num= n;
	System.out.print(n);
	}
	public static void edge(int m)
	{
	   num1=m;
		System.out.println("number of edges is" + m);
		
	}
	public static void incident_matrix(int m,int n)
	{
		System.out.println("the incident matrix of " + m +"vertices and" + n + " edges is");
		for(int i=1;i<=m;i++)
		{
			for(int j=1;j<=n/3;j++)
			{
				//scan1 = new Scanner(System.in);
				//int l=scan1.nextInt();
				
				System.out.print(1  +  " " );
				System.out.print(0 + " ");
				System.out.print(-1 + " ");
		//System.out.println("value in row "  + i +"and  column " + j + "is" + l);
		    }
			System.out.println(" ");
		}
		
	}
	
	
	
	//private static int values(int l)
	//{
		//return l;
		;
		// TODO Auto-generated method stub
			
		
		
	//}
	private static String String(int l) {
		// TODO Auto-generated method stub
		String strI= Integer.toString(l);
		return strI;
	}
	public static void main(String args[])
	{
		scan = new Scanner(System.in);
		int F=scan.nextInt();
		
		System.out.println("number of vertices is" + F);
		int k=scan.nextInt();
		edge(k);
		incident_matrix(F,k);
		//dfs_graph object;
		System.out.println("this is incident matrix representation of a graph");
		
		
		
		
		
		
	}

}
