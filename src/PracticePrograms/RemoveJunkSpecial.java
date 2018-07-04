package PracticePrograms;

public class RemoveJunkSpecial {

	public static void main(String[] args) {
		
	String s="!@#Helloworldsandeep123*&";
	s=s.replaceAll("[^a-zA-Z]", "");
	System.out.println(s);

	}

}
