import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int q;
		double sum=0;
		long k,a,b;
		Scanner sc=new Scanner(System.in);
		q=sc.nextInt();
		while(q>0)
		{
			k=sc.nextLong();
			a=sc.nextLong();
			b=sc.nextLong();
			
			double current=0,trackVal=0,prev=0,lastCurrent=0,count=0;
			sum=0;
			while(current<=b)
			{
				current=(double) (Math.pow(k, count)+lastCurrent);
				lastCurrent=current;
				if(current>=a && current<=b)
				{
					if(trackVal>a)
					sum=(sum+(current-trackVal)*prev)%1000000007;
					else
						sum=(sum+(current-a)*prev)%1000000007;
				}
					
				else if(current>b)
				{
					if(trackVal>a)
						sum=(sum+(b-trackVal+1)*prev)%1000000007;
					else
						sum=(sum+(b-a+1)*prev)%1000000007;
				}
				trackVal=current;
				prev=prev+current;
				count++;
			}
			
			System.out.println((long)sum%1000000007);
			q--;
		}
	}

}
