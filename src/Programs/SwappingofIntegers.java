package Programs;

public class SwappingofIntegers {

	public static void main(String[] args) {
		
		String a="Hello";
		String b="world";
		System.out.println("Before swpping");
		System.out.println("The value of a is:"+a);
		System.out.println("The value of b is:"+b);
		a=a+b;
		b=a.substring(0,a.length()-b.length());
		a=a.substring(b.length());
		System.out.println("After Swapping ");
		System.out.println("The value of a is:"+a);
		System.out.println("The value of b is:"+b);

	}

}
