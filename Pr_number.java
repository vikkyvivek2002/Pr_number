package microsoft;
import java.util.*;

public class Pr_number {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
		 System.out.println("Enter the number :");
		 int n = s.nextInt();
		 int count =0;
		  for(int i =2;i<=n;i++)
		  {
			  count =0 ;
			  for(int j =1;j<=i;j++)
			  {
				  if(i%j==0)
				  {
					  count++;
				  }
			  }
			  if(count == 2)
			  {
				  System.out.println("the prime numbers are " + i);
			  }
			 
		  }

	}

}
