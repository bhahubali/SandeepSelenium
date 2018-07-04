package Programs;

public class RemoveAllWhiteSpaceinString {

	public static void main(String[] args) {
		
		String str="corejava     selenium";
		String s=str.replaceAll("\\s", "");
		System.out.println(s);

	}

}
