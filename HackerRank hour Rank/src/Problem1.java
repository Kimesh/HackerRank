import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i,k,n,t;
		Scanner sc=new Scanner(System.in);
		t=sc.nextInt();
		while(t>0)
		{
			n=sc.nextInt();
			int a[]=new int[n];
			for(i=0;i<n;i++)
				a[i]=sc.nextInt();
			
			int sum=0;
			for(i=0;i<n;i++)
			{
				k=a[i];
				while(k!=0)
				{
					sum=sum+(k%10);
					k=k/10;
				}
			}
			if(sum%3==0)
				System.out.println("Yes");
			else
				System.out.println("No");
			t--;
		}
				
	}

}
