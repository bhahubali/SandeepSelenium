package PracticePrograms;

import java.util.Arrays;

public class LargestandSmallest {

	public static void main(String[] args) {
		
		int numbers[]={10,20,50,80,90,110};
		int largest=numbers[0];
		int smallest=numbers[0];
		for(int i=1;i<numbers.length;i++){
			if(numbers[i]>largest){
				largest=numbers[i];
				
			}
		
			else if(numbers[i]< smallest){
				smallest=numbers[i];
				System.out.println(Arrays.toString(numbers));
				System.out.println(largest);
				System.out.println(smallest);
				
			}
		}
		
		

	}

}
