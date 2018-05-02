import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i,j,d,n,max=0;
		String ans="";
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
		for(i=0;i<n;i++)
		{
			String s=sc.next();
			d=sc.nextInt();
			j=sc.nextInt();
			if(j-d>max)
			{
				max=j-d;
				ans=s;
			}
		}
		System.out.println(ans+" "+max);
	}

}
