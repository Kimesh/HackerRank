import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n,min=0,max=0,i;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int a[]=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			if(a[i]==1)
				max++;
		}
		
		for(i=0;i<n-1;i++)
		{
			if(a[i]==1 && a[i+1]==1)
			{
				min++;
				a[i]=0;
				a[i+1]=0;
			}
		}
		if(a[n-1]==1)
			min++;
		System.out.println(min+" "+max);
	}
	

}
