package Programs;

import java.util.Arrays;

public class LargestAndSmallestNumber {

	public static void main(String[] args) {
		int numbers[]={10,20,30,50,60,100,500};
		int largest=numbers[0];
		int smalest=numbers[0];
		
		for(int i=1;i<numbers.length;i++)
		{
			if(numbers[i]>largest){
				
			}
				largest=numbers[i];
		
		}
	//else if(numbers[i]<smalest)
		//{
		//smalest=numbers[i];
	//}

	System.out.println(Arrays.toString(numbers));
	System.out.println(largest);
	System.out.println(smalest);
	

	

}}
