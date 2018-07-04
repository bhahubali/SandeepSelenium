package JavaPractice;

public class SeparateAlphabetsAndDigitsFromString {

	public static void main(String[] args) {
		
	/*	  String input = "1a2b3c4defgh567jkl";
          separateDigitsAndAlphabets(input);
   }

   public static void separateDigitsAndAlphabets(String str) {
          String number = "";
          String letter = "";
          for (int i = 0; i < str.length(); i++) {
                 char a = str.charAt(i);
                 if (Character.isDigit(a)) {
                       number = number + a;

                 } else {
                       letter = letter + a;

                 }
          }
          System.out.println("Alphates in string:"+letter);
          System.out.println("Numbers in String:"+number);}}*/

		
		/*String input="123ghfc456ujbj952";
		
		seperatedigitsandCharcter(input);
	}
public static void seperatedigitsandCharcter(String str){
	
	String number="";
	String letter="";
	for(int i=0;i<str.length();i++)
	{
		char a=str.charAt(i);
	if(Character.isDigit(a))
	{
		number=number+a;
	}
	else
	{
		letter=letter+a;
		
	}
	}
	System.out.println(number);
	System.out.println(letter);*/
		
		
		String input="12abc456vh89yg36";
		seperateDigitAndNumber(input);	
	}
	public static void seperateDigitAndNumber(String str)
	{
		String number="";
		String letter="";
		for(int i=0;i<str.length();i++)
		{
			char a=str.charAt(i);
			if(Character.isDigit(a))
			{
				number=number+a;
			}
			else
			{
				letter=letter+a;
			}
		}
		System.out.println(letter);
		System.out.println(number);
	}
}
   

