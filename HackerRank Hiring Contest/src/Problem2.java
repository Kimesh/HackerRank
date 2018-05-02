import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i,j,n;
		long count=0;
		boolean flag=true;
		char a[]= {'0','1','2','3','4','5','6','7','8','9'};
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		List<HashSet<Character>> containList=new ArrayList<>();
		List<HashSet<Character>> requiredList=new ArrayList<>();
		for(i=0;i<n;i++)
		{
			String s=sc.next();
			HashSet<Character> containDigits=new HashSet<>();
			HashSet<Character> requiredDigits=new HashSet<>();
			for(j=0;j<a.length;j++)
				requiredDigits.add(a[j]);
			for(j=0;j<s.length();j++)
			{
				char c=s.charAt(j);
				if(!containDigits.contains(c))
				{
					containDigits.add(c);
					requiredDigits.remove(c);
				}
			}
			
			containList.add(containDigits);
			requiredList.add(requiredDigits);
		}

		count=0;
		for(i=0;i<requiredList.size();i++)
		{
			HashSet<Character> requiredSet=requiredList.get(i);
			for(j=0;j<containList.size();j++)
			{
				HashSet<Character> containSet=containList.get(j);
				
				flag=true;
				for(Character c: requiredSet)
				{
					if(!containSet.contains(c))
					{
						flag=false;
						break;
					}
				}
				if(flag)
					count++;
			}
		}
		
		System.out.println(count/2);
	}

}
