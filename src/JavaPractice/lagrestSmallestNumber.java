package JavaPractice;

import java.util.Arrays;

public class lagrestSmallestNumber {

	public static void main(String[] args) {
	int numbers[]={10,20,30,50,60,80,90};
	int largest=numbers[0];
	int smallest=numbers[0];
	
	for(int i=0;i<numbers.length;i++){
		if(numbers[i]>largest)
		{
			largest=numbers[i];
			
		}
	
		else if( numbers[i]<smallest )
		{
			smallest=numbers[i];
		}
	}
		//System.out.println(Arrays.toString(numbers));
		System.out.println(largest);
		System.out.println(smallest);
	}
	
	
	
	}
	
	

	
