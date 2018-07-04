package JavaPractice;

import java.util.HashMap;
import java.util.HashSet;

public class DuplicateElentsinArray {

	public static void main(String[] args) {
		
	/*	String []str={"abc","bcd","ade","abc","def","abc","abc"};
		HashSet<String>set=new HashSet<String>();
		for(String array:str){
			if(!set.add(array))
			{
				System.out.println(array);
			}
		}*/
		

		
		/*String[]str={"123","456","789","123","567","456"};
		HashSet<String>set=new HashSet<String>();
		
		for(String array:str){
			if(!set.add(array))
			{
				System.out.println(array);
			}*/
		
		
		//******************2nd method***********************
			int[] array = {1,1,2,3,4,5,6,7,8,8};
	         
	        HashSet<Integer> set = new HashSet<Integer>();
	         
	        for(int i = 0; i < array.length ; i++)
	        {
	            //If same integer is already present then add method will return FALSE
	            if(set.add(array[i]) == false)
	            {
	                System.out.println("Duplicate element found : " + array[i]);
	            }
	        }
		}
	}


