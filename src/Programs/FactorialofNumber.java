package Programs;

public class FactorialofNumber {

	public static void main(String[] args) {
		
		int number=5;
		int factorial=number;
		for(int i=(number-1);i>1;i--)
		{
			factorial=factorial*i;
			
		}
	
	System.out.println("factorial of given number is :"+factorial);
	}
	

}
