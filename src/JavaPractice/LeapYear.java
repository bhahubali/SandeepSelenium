package JavaPractice;

public class LeapYear {

	public static void main(String[] args) {
		
		int year=403;
		if((year%400==0)||(year%4==0)){
			System.out.println("leap year");
		}
		else
			System.out.println("not leap year");

	}

}
