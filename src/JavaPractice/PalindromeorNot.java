package JavaPractice;

import java.util.Scanner;

public class PalindromeorNot {

	public static void main(String[] args) {
		int num,m,a=0,x;
		Scanner sc =new  Scanner(System.in);
	
System.out.println("Enter the number");

  num=sc.nextInt();
  m=num;
  while(num>0){
	  x=num/10;
	  a=a*10+x;
	  num=num/10;
  }
  if(a==m)
  {
	  System.out.println(m+" is a palindrome");
	  
  }
  else
	  System.out.println(m+" not a palindrome");
	
	/*int num,m,x,a=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	num=sc.nextInt();
	m=num;
	while(num>0)
	{
		x=num/10;
		a=a*10+x;
		num=num/10;
	}
	if(a==m)
	{
		System.out.println(m+ "is a palindrome");
	}
	else
		System.out.println(m+ " not a plindrome");*/
	}

}
