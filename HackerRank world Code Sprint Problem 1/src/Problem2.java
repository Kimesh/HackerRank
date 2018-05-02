import java.util.Scanner;

public class Problem2 {

	static int[] index_i= {-2,-2,0,2,2,0};
	static int[] index_j= {-1,1,2,1,-1,-2};
	static String[] str= {"UL","UR","R","LR","LL","L"};
	static int max=Integer.MAX_VALUE;
	static String ans="";
		public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n,i,j,k,count=0,iStart,jStart,iEnd,jEnd;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
		int a[][]=new int[n][n];
		
		iStart=sc.nextInt();
		jStart=sc.nextInt();
		iEnd=sc.nextInt();
		jEnd=sc.nextInt();
		
		fun(a,iStart,jStart,iEnd,jEnd,0,n,"");
		
		if(max==Integer.MAX_VALUE)
			System.out.println("Impossible");
		else
		{
			System.out.println(max);
			System.out.println(ans);
		}
	}
		private static void fun(int[][] a, int iStart, int jStart, int iEnd, int jEnd, int count, int n,String s) {
			
			if(iStart==iEnd && jStart==jEnd && count<max)
			{
				max=count;
				ans=s;
				return;
			}
			
			for(int i=0;i<6;i++)
			{
				if(iStart+index_i[i]==iEnd && jStart+index_j[i]==jEnd)
				{
					a[iStart][jStart]=1;
					fun(a,iStart+index_i[i],jStart+index_j[i],iEnd,jEnd,count+1,n,s+str[i]+" ");
					a[iStart][jStart]=0;
					return;
				}
			}
			for(int i=0;i<6;i++)
			{
				if(check(iStart+index_i[i], jStart+index_j[i],n,a))
				{
					a[iStart][jStart]=1;
					fun(a,iStart+index_i[i],jStart+index_j[i],iEnd,jEnd,count+1,n,s+str[i]+" ");
					a[iStart][jStart]=0;
				}
			}
		}
		private static boolean check(int i, int j,int n,int[][]a) {
			if(i>=0 && i<n && j>=0 && j<n && a[i][j]==0)
				return true;
			else
			return false;
		}

}
