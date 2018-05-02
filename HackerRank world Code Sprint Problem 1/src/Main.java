import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i,sum,t,n;
		Scanner sc=new Scanner(System.in);
		t=sc.nextInt();
		while(t>0)
		{
			n=sc.nextInt();
			int a[]=new int[n];
			sum=0;
			for(i=0;i<n;i++)
				a[i]=sc.nextInt();
			
			Arrays.sort(a);
			for(i=0;i<n-1;i++)
				sum=sum+Math.abs(a[i+1]-a[i]);
			
			System.out.println(sum);
			t--;
		}
	}

}
