package JavaPractice;

public class SwappingTwoStrings {

	public static void main(String[] args) {
		
	/*	String a="Hello";
		String b="world";
		System.out.println("before swapping");
		System.out.println("the  value of a is:"+a);
		System.out.println("the  value of b is:"+b);

		a=a+b;
		b=a.substring(0,a.length()-b.length());
		a=a.substring(b.length());
		System.out.println("After  swapping");
		System.out.println("the  value of a is:"+a);
		System.out.println("the  value of b is:"+b);
*/
		
		
		
	/*	String  a="panyam";
		String b="sandeep";
		System.out.println("before swapping");
		System.out.println("the  value of a is:"+a);
		System.out.println("the  value of b is:"+b);

		a=a+b;
		b=a.substring(0,a.length()-b.length());
		a=a.substring(b.length());
		System.out.println("after swapping");
		System.out.println("the  value of a is:"+a);
		System.out.println("the  value of b is:"+b);

		*/
		String a="hello";
		String b="World";
		a=a+b;
		b=a.substring(0,a.length()-b.length());
		a=a.substring(b.length());
		System.out.println(a);
		System.out.println(b);
	}

}
