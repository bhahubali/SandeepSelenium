package JavaPractice;

public class RemoveallWhiteSapces {

	public static void main(String[] args) {
	
		String str="core java jsp    servalets";
		String withoutspace=str.replaceAll("\\s", "");
		System.out.println(withoutspace);
	}

}
