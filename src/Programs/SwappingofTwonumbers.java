package Programs;

public class SwappingofTwonumbers {

	public static void main(String[] args) {
		
		int x=10;
		int y=20;
		// 1. with using third variable
		/*int temp;
		temp=x;
		x=y;
		y=temp;*/
		
		//2. without using third variable
		/*x=x+y;
		y=x-y;
		x=x-y;
		*/
		//3.without using third variable
		
		/*x=x^y;
		y=x^y;
		x=x^y;*/
		//without using third variable
		x=x*y;
		y=x/y;
		x=x/y;
		
		System.out.println(x);

		System.out.println(y);
	}

}
