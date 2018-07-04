package Sample;

public class CountThenumberofWordsrepetating {

	public static void main(String[] args) {
		
		String s=" java ismy jeva";
		char c='v';
		int count=s.length()-s.replace("v", "").length();
		System.out.println(count);

	}

}
