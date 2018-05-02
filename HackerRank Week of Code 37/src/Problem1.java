import java.text.DecimalFormat;
import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n,i;
		double sum=0,count=0,average;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int rating[]=new int [n];
		for(i=0;i<n;i++)
		{
			rating[i]=sc.nextInt();
			if(rating[i]>=90)
			{
				sum=sum+rating[i];
				count++;
			}
		}
		if(sum==0)
			System.out.println("0.00");
		else
		{
			average=(double) Math.round((sum/count)*100)/100;
			DecimalFormat format=new DecimalFormat("##.00");
			System.out.println(format.format(average));
		}
		
	}

}
