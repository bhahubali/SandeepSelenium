package Sample;

public class ReverseString {

	public static void main(String[] args) {
		
		String s="helloworld";
		int length=s.length();
		System.out.println(length);
		
		String rev="";
		/*StringBuffer sbf=new StringBuffer(s);
		System.out.println(sbf.reverse());
		*/
		/*for(int i=length-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
			
		}
		System.out.println(rev);*/
	
	char[] ch=s.toCharArray();
	for( int  i=ch.length-1;i>=0;i--)
	{
		System.out.print(ch[i]);
	}
	
	System.out.println();
	
	}

}
