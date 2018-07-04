package Sample;

import java.util.Scanner;

public class CountNumberofChracters {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s=sc.nextLine();
		String[]word=s.trim().split("");
		System.out.println("the number of words in a string is :"+word.length);
		
		
	}

}
