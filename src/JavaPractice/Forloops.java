package JavaPractice;

public class Forloops {

	public static void main(String[] args) {
		
	/*	for(int i=1;i<=10;i++)
		{
			System.out.print(i);
		}
*/
	/*	for(int i=1;i<=5;i++)
		{
			System.out.println(i+50);
		}*/
	
	/*for(int i=1;i<10;i++)
	{
		for(int j=1;j<10;j++)
		{
			System.out.print(j);
		}
	
		System.out.println();
	}*/
		/*for(int i=1;i<10;i++)
		{
			for(int j=1;j<10;j++)
			{
				System.out.print(j);
			}
		
			System.out.println();
		}*/
		
		/*for(int i=0;i<=10;i++)
		{
			for(int j=0;j<=10;j++)
			{
				
				System.out.println(i+"*"+j+"="+(i*j));
			}
			}*/
		/*for(int i=0;i<=10;i++)
		{
			System.out.println(5+"*"+i+ "="+(5*i));
		}*/
		
	/*	
		int k=10;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(k+" ");
				k+=10;
		
			}
		
			System.out.println();
		}
*/
		/*for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(" *");
			}
		
			System.out.println();
		}*/

		
		/*for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(i==j)
					System.out.print(i);
				else
					System.out.print(" ");
			}
	
		
		
		System.out.println();
	}*/
	
		/*for(int i=0;i<=5;i++)
		{
			for(int j=0;j<=i;j++)
			{
				if(i==j)
					System.out.print("*");
				else
					System.out.print(" ");
				
			}
		
			System.out.println();
		}*/
	/*
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i==j || i+j==6)
					System.out.print(i);
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	*/
		
		/*for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i==j|| i+j==6)
			
					System.out.print(j);
				else
					System.out.print(" ");
			}
		
			System.out.println();
			
}*/
		
	
		/*String space=" ";
		for(int i=1;i<=5;i++)
		{
			System.out.println(space+i+" \n");
			space=space+" ";
			
		}*/
		
		
	/*	System.out.println("1\n 2\n  3\n   4\n    5");*/
		
	/*	for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}*/
		/*int counter=1;
		for(int i=1;i<5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				
				System.out.print(counter++);
			}
			System.out.println();
		}*/
		
		/*
		 * int counter=10;
		 * for(int i=1;i<5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				
				System.out.print(counter--);
			}
			System.out.println();
		}*/
		/*int counter1=10;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(counter1--);
			}
			System.out.println();
		}
*/
		
		int counter=1;
		int rows=4;
		for(int i=1;i<=rows;i++)
		{
			for(int k=rows-i;k>=1;k--)
			{
				System.out.print(" ");
				for(int j=1;j<=i;j++)
				{
					System.out.print(counter++  + " ");
				}
			System.out.println();
			}
		}
		
		
		
	}
	}