package Sample;

import java.util.HashMap;

public class CountTheNumberofEachCharacterinString {

	public static void main(String[] args) {
	
		int i;
		int count;
		String str="java is my jeva and again java is again my jeva";
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
		System.out.println();

}
}















































