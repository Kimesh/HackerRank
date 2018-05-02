import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	  public static void main(String[] args) throws IOException {
	        Scanner in = new Scanner(System.in);
	        final String fileName = System.getenv("OUTPUT_PATH");
	        BufferedWriter bw = null;
	        if (fileName != null) {
	            bw = new BufferedWriter(new FileWriter(fileName));
	        }
	        else {
	            bw = new BufferedWriter(new OutputStreamWriter(System.out));
	        }

	        int res;
	        int num_size = 0;
	        num_size = Integer.parseInt(in.nextLine().trim());

	        int[] num = new int[num_size];
	        for(int i = 0; i < num_size; i++) {
	            int num_item;
	            num_item = Integer.parseInt(in.nextLine().trim());
	            num[i] = num_item;
	        }

	        res = reductionCost(num);
	        bw.write(String.valueOf(res));
	        bw.newLine();

	        bw.close();
	    }

	  static int reductionCost(int[] num) {
		// TODO Auto-generated method stub
		  int i,n,j,sum=0;
		  n=num.length;
		  
		  PriorityQueue<Integer> queue=new PriorityQueue<Integer>();
		  for(i=0;i<n;i++)
			  queue.add(num[i]);
		
		  while(queue.size()!=1)
		  {
			  int val1=queue.poll();
			  int val2=queue.poll();
			  sum=sum+val1+val2;
			  queue.add(val1+val2);
		  }
		  
		 
		return sum;
	}
	
}
