package Programs;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class DuplicateElementsinanArray {

	public static void main(String[] args) {
	
		/*String names[]={"java","c","testing","selenium","java"};
		
		for(int i=0;i<names.length;i++)
		{
			for(int j=i+1;j<names.length;j++){
				
				if(names[i].equals(names[j])){
					System.out.println("Duplicate Elements in an array is:"+ names[i]);
				}
			}
		}
		
		System.out.println("**********************");
		
		Set<String> store=new HashSet<String>();
		
		for(String name:names){
			if(store.add(name)==false)
			System.out.println("Duplicate Elements in an array is:"+name);
			
		     
		}*/
 
	String names[]={"sandeep","vijay","chaitanya","raja","lakshmi","lakshmi"};
	
	for(int i=0;i<names.length;i++){
		for(int j=i+1;j<names.length;j++){
			if(names[i].equals(names[j]))
				System.out.println("duplicate elements in an array is:"+ names[i]);
			
		}
	}
	
	
	System.out.println("********************************");
	Set<String> store=new HashSet<String>();
	
	for(String name:names)
	{
		if(store.add(name)==false)
			System.out.println("duplicate elements in an array is:"+ name);
			
	}
	
	}

}
