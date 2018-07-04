package Sample;

public class SwappingofTwoStrings {

	public static void main(String[] args) {
		
		String a="panyam";
		String b="sandeep";
		
		a=a+b;
		b=a.substring(0,a.length()-b.length());
		a=a.substring(b.length());
		System.out.println(a);
		System.out.println(b);
		
	}

}
