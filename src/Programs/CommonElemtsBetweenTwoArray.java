package Programs;

import java.util.Arrays;
import java.util.HashSet;

public class CommonElemtsBetweenTwoArray {

	public static void main(String[] args) {
		
		/*String s1[]={"one","two","three","five","six"};
		String s2[]={"three","four","five","one","eight"};
		HashSet<String>set=new HashSet<String>();
		for(int i=0;i<s1.length;i++){
			for(int j=0;j<s2.length;j++){
				if(s1[i].equals (s2[j])){
					set.add(s1[i]);
				}
			}
		}

		System.out.println(set);*/
		
	Integer []i1={1,2,3,4,5,6};
	Integer []i2={2,4,6,7,8,9};
	HashSet <Integer> set1=new HashSet<>(Arrays.asList(i1));
	HashSet <Integer> set2=new HashSet<>(Arrays.asList(i2));
	set1.retainAll(set2);
	System.out.println(set1);
	
	
	}

}
