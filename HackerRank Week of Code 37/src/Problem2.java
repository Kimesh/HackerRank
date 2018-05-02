import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int n;
		long x=0,y;
		String str;
		n=sc.nextInt();
		while(n>0)
		{
			str=sc.next();
			y=sc.nextLong();
			if(str.equals("add") && x+y>x)
				x=x+y;
			else if(str.equals("set") && y>x)
				x=y;
			n--;
		}
		System.out.println(x);
	}

}
