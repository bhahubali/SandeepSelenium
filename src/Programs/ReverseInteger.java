package Programs;

public class ReverseInteger {

	public static void main(String[] args) {
		  
		int num=123456;
		 int rev=0;
		 while(num!=0){
			 rev=rev*10+num%10;
			 num=num/10;
			 
		 }
		 System.out.println("reverse number is:"+ rev);
		 
		
	//********************************************
	int num2= 456789;
	System.out.println(new StringBuffer(String.valueOf(num2)).reverse());
	
	}

}
