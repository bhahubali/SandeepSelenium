package Programs;

public class DetermineifYearsisLeapYear {

	public static void main(String[] args) {
		
		int year=2013;
		if((year%400==0)||(year%4==0)&& (year%100!=0))
		{
		System.out.println("year" +year+ "is a leap year");	
			
		}
		else
		{
			System.out.println("year" +year+ "is a not leap year");	
			
		}
	}

}
