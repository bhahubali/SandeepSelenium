package Sample;

import java.util.Arrays;

public class LagestandSmallest {

	public static void main(String[] args) {
		
		int num[]={10,20,30,50,60,80,90};
		int largest=num[0];
		int smallest=num[0];
		
		for(int i=0;i<num.length;i++)
		{
			if(num[i]>largest)
			{
		largest=num[i];
			}
		
			else if(num[i]<smallest){
				smallest=num[i];
			}
		
		
		}
System.out.println(Arrays.toString(num));
		System.out.println(largest);
System.out.println(smallest);	}

}
