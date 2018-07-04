package Programs;

public class Palindrome {

	public static void main(String[] args) {
		
		int numbers[]= new int[]{121,13,34,11,22,54};
		for(int i=0;i<numbers.length;i++){
			int number=numbers[i];
			int reversenumber=0;
			int temp=0;
			while(number>0){
				temp=number%10;
				number=number/10;
				reversenumber=reversenumber*10+temp;
			}
			if(numbers[i]==reversenumber)

				System.out.println(numbers[i]+"is a palindrome");
			else
				System.out.println(numbers[i]+"is a not  palindrome");
		}

	}

}
