package Sample;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		 int factorial=num;
		for(int i=(num-1);i>1;i--)
		{
			factorial=factorial*i;
			
			
		}
		System.out.println(factorial);
	}

}
