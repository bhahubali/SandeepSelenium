package JavaPractice;

import java.util.Scanner;

public class CountNumberofWords {

	public static void main(String[] args) {

	
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s=sc.nextLine();
		//************************first method********************
		String []words=s.trim().split("");
		System.out.println("number of words in a given string"+words.length);
		
		//************************Second  method********************
		/*int count=1;
		
		for(int i=0;i<s.length()-1;i++){
			
			if((s.charAt(i)=='')&&(s.charAt(i+1)!='')){
				count++;
			}
		}
		
		System.out.println(count);*/
	
	Scanner sc1=new Scanner(System.in);
	System.out.println("enter the number");
	String str=sc1.nextLine();
String[] word =str.trim().split("");
System.out.println(word.length);

	
	}

}
