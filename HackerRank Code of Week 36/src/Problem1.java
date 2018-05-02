import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int q,i,j,n,k;
		boolean polyFlag ,hydroFlag;
		Scanner sc=new Scanner(System.in);
		q=sc.nextInt();
		while(q>0)
		{
			String s=sc.next();
			polyFlag=false;
			hydroFlag=false;
			n=s.length();
			if(n<=1)
				System.out.println("not an acid");
			else 
			{
				if(s.charAt(n-1)=='c' && s.charAt(n-2)=='i')
					polyFlag=true;
				if(n>=7 && s.charAt(0)=='h' && s.charAt(1)=='y' && s.charAt(2)=='d' && s.charAt(3)=='r' && s.charAt(4)=='o')
					hydroFlag=true;
			}
			if(polyFlag && hydroFlag)
				System.out.println("non-metal acid");
			else if(polyFlag && !hydroFlag)
				System.out.println("polyatomic acid");
			else 
				System.out.println("not an acid");
			q--;
		}
	}

}
