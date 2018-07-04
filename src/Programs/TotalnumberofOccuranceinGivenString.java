package Programs;

public class TotalnumberofOccuranceinGivenString {

	public static void main(String[] args) {
	
		String s="java is java and java is my java again";
		char c='j';
		int count=s.length()-s.replace("j", "").length();
		System.out.println(" total no.of occurance of a word in given string : "+count);
		
	}

}
