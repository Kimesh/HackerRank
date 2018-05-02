import java.util.Scanner;

public class Question_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int q,startVal,endVal,i,j,count=0,n,first,second;
		n=1000001;
		Scanner sc=new Scanner(System.in);
		int a[]=new int[n];
		for(i=2;i<Math.sqrt(n);i++)
		{
			if(a[i]==0)
			{
				for(j=i*2;j<n;j=j+i)
				{
					//System.out.println("Inside j: "+j);
					a[j]=1;
				}
					
			}
		}
		
		q=sc.nextInt();
		while(q>0)
		{
			startVal=sc.nextInt();
			endVal=sc.nextInt();
			
			first=0;
			second=0;
			for(i=startVal;i<=endVal;i++)
			{
				if(a[i]==0)
				{
					first=i;
					break;
				}
			}
			for(i=endVal;i>=startVal;i--)
			{
				if(a[i]==0)
				{
					second=i;
					break;
				}
			}
			System.out.println(second-first);
			q--;
		}
	}

}
