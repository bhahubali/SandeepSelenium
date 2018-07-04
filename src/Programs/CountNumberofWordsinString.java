package Programs;

import java.util.Scanner;

public class CountNumberofWordsinString {

	public static void main(String[] args) {
	
		/*System.out.println(" Enter the string");
		Scanner  sc=new Scanner(System.in);
		 String s=sc.nextLine();
		 String[] words=s.trim().split("");
		 System.out.println(" total no.of charcter in a given String is"+words.length);*/
		
	   System.out.println("*****************************");
          System.out.println("enter the string");
          Scanner sc =new Scanner(System.in);
          String s=sc.nextLine();
          int count=1;
          for(int i=0;i<s.length()-1;i++){
        	  if((s.charAt(i)==' ')&&(s.charAt(i+1))!=' ')
{
        		  count++;
        		  
        	  }
                }
	
          System.out.println(" No.of wiords in a string="+ count);
	}

}
