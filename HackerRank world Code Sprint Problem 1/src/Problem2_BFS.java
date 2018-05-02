import java.util.LinkedList;
import java.util.Scanner;

public class Problem2_BFS {

	static int[] index_i= {-2,-2,0,2,2,0};
	static int[] index_j= {-1,1,2,1,-1,-2};
	static String[] str= {"UL","UR","R","LR","LL","L"};
		public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n,i,j,k,count=0,iStart,jStart,iEnd,jEnd;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		boolean flag=true;
		int a[][]=new int[n][n];
		
		iStart=sc.nextInt();
		jStart=sc.nextInt();
		iEnd=sc.nextInt();
		jEnd=sc.nextInt();
		
		LinkedList<Node> queue=new LinkedList<Node>();
		
		queue.add(new Node(iStart,jStart,0,""));
		
		while(!queue.isEmpty() && flag)
		{
			Node tempNode=queue.pollFirst();
			
			for(i=0;i<6;i++)
			{
				if(check(tempNode.i+index_i[i],tempNode.j+index_j[i],n,a))
				{
					a[tempNode.i+index_i[i]][tempNode.j+index_j[i]]=1;
					Node temp=new Node(tempNode.i+index_i[i],tempNode.j+index_j[i],tempNode.count+1,tempNode.s+str[i]+" ");
					queue.add(temp);
					
					if(temp.i==iEnd && temp.j==jEnd )
					{
						flag=false;
						System.out.println(temp.count);
						System.out.println(temp.s);
						break;
					}
				}
				
			}
		}
		
		if(flag)
			System.out.println("Impossible");
		}
		
		private static boolean check(int i, int j,int n, int[][] a) {
			if(i>=0 && i<n && j>=0 && j<n && a[i][j]==0)
				return true;
			else
			return false;
		}

}

class Node{
	int i,j,count;
	String s;
	public Node(int i, int j, int count, String s) {
		super();
		this.i = i;
		this.j = j;
		this.count = count;
		this.s = s;
	}
	
	
}
