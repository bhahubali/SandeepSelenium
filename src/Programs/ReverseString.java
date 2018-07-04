package Programs;

public class ReverseString {

	public static void main(String[] args) {
		String s="sandeep123";
		/*int length=s.length();
		System.out.println(length);
		String rev="";
		for(int i=length-1;i>=0;i--){
			rev=rev+s.charAt(i);
			
		}
	System.out.println(rev);*/
	
	
		StringBuffer sbf=new  StringBuffer(s);
		System.out.println(sbf.reverse());
	}

}
