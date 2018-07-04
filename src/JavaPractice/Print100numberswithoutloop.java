package JavaPractice;

import java.nio.charset.MalformedInputException;

public class Print100numberswithoutloop {

	/*public static void main(String[] args) {
		
		printNumber(1);
	}
 
	public static void printNumber(int number) {
		printNextNumber(number);	
	}
 
	private static void printNextNumber(int nextNumber) {
		if(nextNumber <= 100) {				
			System.out.print(nextNumber +" ");
			nextNumber++;
			printNumber(nextNumber);		//Note: calls first method again
		}else {
			System.exit(0);
		}
	*/
	/*public static void recursivefun(int n) 
	{ 
	 
	  if(n <= 100) {
	 
	       System.out.println(n); 
	         recursivefun(n+1);   }
	}
	 
	public static void main(String args[]) 
	{
	 
	recursivefun(1); 
	 
	 }*/
	public static void main(String[] args) 
	{
		int number = 1;
		
		printNumbers(number);	
	}
	
	public static void printNumbers(int num)
	{
		if(num <= 100)
		{
			System.out.print(num +" "); 
			printNumbers(num + 1);
		}	
	}


	
	
}




