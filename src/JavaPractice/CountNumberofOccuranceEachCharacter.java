package JavaPractice;

import java.util.HashMap;

public class CountNumberofOccuranceEachCharacter {

	public static void main(String[] args) {
	
		/*int i;
		int count =0;;
		String str=" Java is my Jeva again java is my jeva";
		HashMap<Character,Integer> charcount=new HashMap<Character,Integer>();
		
		char[] strarray=str.toCharArray();
		
		for(i=0;i<strarray.length;i++)
		{
			count=0;
			
		
		
		
		for(int j=0;j<strarray.length;j++)
		{
			
			if(strarray[i]==strarray[j])
			{
			
				count++;
			}
		}
	
	charcount.put(strarray[i], count);
		}
	System.out.println(charcount);*/

	  
	/*	int i;
		int count=0;
		String str="Hello This is Sandeep I am SeniorTestEngineer";
		
		HashMap<Character,Integer > charcount=new HashMap<Character,Integer>();
		
		char[]strarray=str.toCharArray();
		
		for(i=0;i<strarray.length;i++)
		{
		count=0;	
		for(int j=0;j<strarray.length;j++)
		{
		if(strarray[i]==strarray[j])
		{
		count++	;
		
		}	
		}
		charcount.put(strarray[i],count);		
		}
		
		
		
		System.out.println(charcount);
	
	*/
		/*
		int i;
		int count;
		
		String str="my self is sandeep iam from ap";
		HashMap<Character,Integer> charcount=new HashMap<Character,Integer>();
		char[]strarray=str.toCharArray();
		for( i=0;i<strarray.length;i++)
		{
			count=0;
			for(int j=0;j<strarray.length;j++)
			{
				if(strarray[i]==strarray[j])
				{
					count++;
				}
		
			}
			
			charcount.put(strarray[i], count);
		}
		System.out.println(charcount);
		
	   }   
	
     }*/
		
	/*int i;
	int count;
	
	String str="hello how are you i am sandeep";
	HashMap<Character,Integer> charcount=new HashMap<Character,Integer>();
	char[] strarray=str.toCharArray();
	
	for( i=0;i<strarray.length-1;i++){
		count=0;
		for(int j=0;j<strarray.length-1;j++){
			if(strarray[i]==strarray[j])
			{
				count++;
			}
		}
	
	charcount.put(strarray[i], count);
	}
	System.out.println(charcount);
	

		
	}}


*/
		int i;
		int count;
		
	String str=" hello how are you";
	
	HashMap<Character,Integer>charcount=new HashMap<Character,Integer>();
	char[] strarray=str.toCharArray();
	for(i=0;i<strarray.length;i++)
	{
		count=0;
		for(int j=0;j<strarray.length;j++)
		{
			if(strarray[i]==strarray[j])
			{
				count++;
			}
		}
		charcount.put(strarray[i], count);
	}
	System.out.println(charcount);
	}}