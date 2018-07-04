package JavaPractice;

public class ReverseString {

	public static void main(String[] args) {
	
		String s="HelloWorldIamSandeep";
		
		int length=s.length();
		System.out.println(length);
		String rev="";
		
		//*******************First Method*******************
		/*StringBuffer sbf=new StringBuffer(s);
		
		System.out.println(sbf.reverse());*/
		
		//*******************Second  Method*******************
	/*	String rev="";
		for(int i=length-1;i>=0;i--){
		
		rev=rev+s.charAt(i);
		}
			System.out.println(rev);
		*/
	
		//*******************Third Method*******************
		/*char[]strarray=s.toCharArray();
		for(int i=strarray.length-1;i>=0;i--){
			System.out.print(strarray[i]);
		}
	System.out.println();*/
		for(int i=length-1;i>=0;i--){
			rev=rev+s.charAt(i);}
System.out.println(rev);			
		
	}}
