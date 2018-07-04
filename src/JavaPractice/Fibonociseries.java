package JavaPractice;

public class Fibonociseries {

	public static void main(String[] args) {
	
		/* int n = 10, t1 = 0, t2 = 1;
	        System.out.print("First " + n + " terms: ");

	        for (int i = 0; i <= n; ++i)
	        {
	           
	            int sum = t1 + t2;
	            t1 = t2;
	            t2 = sum;
	           System.out.print(sum+" ");
	    
			
		}*/
	int first=0,second=1;
	int next;
	for(int i=0;i<=10;i++)
	{
		next=first+second;
		first=second;
		second=next;
	
	System.out.println(next);
	}
	}}


