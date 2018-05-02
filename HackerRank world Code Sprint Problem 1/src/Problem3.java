import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i,j,k,val,n,max=1;
		long sum=0;
		
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
		long a[] =new long[n];
		for(i=0;i<n;i++)
			a[i]=sc.nextLong();
		
		for(i=0;i<n;i++)
			sum=sum+fun(a[i])+1;
		System.out.println(sum);
	}

	private static long fun(long n) {
		int i;
		if(n==0)
			return 0;
		else if(n==1)
			return 0;
		else if(n%2==0)
			return n+fun(n/2);
		else
		{
			for(i=2;i<=Math.sqrt(n);i++)
			{
				if(n%i==0)
					return n+fun(n/i);
			}
			return n;
		}
	}

}
