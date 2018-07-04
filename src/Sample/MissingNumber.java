package Sample;

public class MissingNumber {

	public static void main(String[] args) {
		
		int a[]={1,2,4,5,6,7,8,9,10};
		int sum=0;
		for(int i=0;i<a.length-1;i++)
		{
			sum=sum+a[i];
		}

		System.out.println(sum);
		int sum1=0;
		for(int j=0;j<10;j++)
		{
			sum1=sum1+j;
		}
	System.out.println(sum1);
	System.out.println((sum1-sum));
	}

}
