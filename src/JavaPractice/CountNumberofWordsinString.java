package JavaPractice;

public class CountNumberofWordsinString {

	public static void main(String[] args) {
		
		String s="hello this i sandeep";
		char c='a';
		int count=s.length()-s.replace("a", "").length();
		System.out.println(count);
	}

}
