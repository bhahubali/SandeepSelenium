package Sample;

public class RemoveJunkValues {

	public static void main(String[] args) {
		
		String s="@#$sandeep123456*&^%";
		s=s.replaceAll("[^a-zA-Z]", " ");
		System.out.println(s);
	}

}
