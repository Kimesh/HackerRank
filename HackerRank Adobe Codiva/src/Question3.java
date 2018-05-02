import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,k,n,m,index1=0,index2=0,count=0,sum,diff,val;
		List<Integer> b=new ArrayList<Integer>();
		String x,y;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		m=sc.nextInt();
		k=sc.nextInt();
		
		if(Math.min(n, m)<k)
			System.out.println(-1);
		
		int a[][]=new int[m+1][n+1];
		x=sc.next();
		y=sc.next();
		
		for(i=1;i<m+1;i++)
		{
			for(j=1;j<n+1;j++)
			{
				if(x.charAt(j-1)==y.charAt(i-1))
				{
					a[i][j]=a[i-1][j-1]+1;
//					System.out.println("value after add: "+a[i][j] +" , i: "+i+" , j:"+ j);
				}
				else
					a[i][j]=Math.max(a[i-1][j], a[i][j-1]);
			}
		}
		
		j=n;
		i=m;
		
		//System.out.println(x.charAt(j-1)+",,,"+y.charAt(i-1));
		while(i!=0 && j!=0)
		{
			val=Math.max(a[i][j-1], a[i-1][j]);
			if(val==a[i][j])
			{
				if(a[i][j]==a[i][j-1])
					j=j-1;
				else
					i=i-1;
			}
			else
			{
				index1=i;
				index2=j;
				i=i-1;
				j=j-1;
				//System.out.println("index value: "+index1+" "+index2+" , index");
			//	System.out.println("char: "+x.charAt(index2-1)+","+y.charAt(index1-1));
			}
		}
		
		if(a[m][n]>=k)
			System.out.println(k);
		else
		{
			diff=k-a[m][n];
			
			for(i=1;i<index2;i++)
			{
				for(j=1;j<index1;j++)
				{
					
					b.add((x.charAt(j-1)-97)^(y.charAt(i-1)-97));
					count++;
				}
			}
			
			//System.out.println("Integer Vaule: ");
		//	System.out.println();
			int temp[]=new int[b.size()];
			i=0;
			for(i=0;i<b.size();i++)
				temp[i]=b.get(i).intValue();
//			for(int f:temp)
//				System.out.print(f+" ");
			Arrays.sort(temp);
			sum=0;
			for(i=0;i<diff;i++)
				sum=sum+temp[i];
			System.out.println(sum);
		}
	}

}
