package PracticePrograms;

public class ReverseString {

	public static void main(String[] args) {
	
	String s="HelloWorld";
	
	 int length=s.length();
	 System.out.println(length);
	 
	 
	String rev="";
	for(int i=length-1;i>=0;i--)
	{
		
		rev=rev+s.charAt(i);
		
	}
	System.out.println(rev);
	
	String s1="helloselenium";
	StringBuffer sbf=new StringBuffer(s1);
	System.out.println(sbf.reverse());
	}

}
