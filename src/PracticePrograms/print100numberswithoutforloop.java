package PracticePrograms;

import java.util.Scanner;

public class print100numberswithoutforloop {

	public static void main(String[] args) {
	/*int number=1;
	printNumber(number);
	}
	public static void printNumber(int num){
		if(num<=100){
			System.out.println(num+" ");
			printNumber(num+1);
		}*/
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s=sc.nextLine();
		String[]words=s.trim().split("");
		System.out.println(words.length);
		
	}
	}