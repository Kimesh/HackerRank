import java.util.Arrays;
import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int i,n,count,t;
		t=sc.nextInt();
		while(t>0)
		{
			n=sc.nextInt();
			int a[]=new int[n];
			int b[]=new int[n];
			for(i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
				b[i]=a[i];
				
			}
				Arrays.sort(b);
			count=0;
			for(i=0;i<n;i++)
	        {
				if(a[i]!=b[i])
				count++;
	        }
	        if((count/2)>1)
	            System.out.println("NO");
	        else 
	            System.out.println("YES");
			t--;
		}
	}

}
