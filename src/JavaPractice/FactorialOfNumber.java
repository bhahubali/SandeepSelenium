package JavaPractice;

import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) {
		/*Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int number=sc.nextInt();
		
		
		int factorial=number;
		
		for(int i=(number-1);i>1;i--){
			
			factorial=factorial*i;
		}
		System.out.println(factorial);*/
		
Scanner sc =new Scanner(System.in);
System.out.println("Enter The number");
int num=sc.nextInt();
int factorial=num;

for(int i=num-1;i>1;i--){
	factorial=factorial*i;
}
	System.out.println(factorial);

}}

