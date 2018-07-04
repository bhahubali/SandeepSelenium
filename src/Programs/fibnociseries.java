package Programs;

public class fibnociseries {

	public static void main(String[] args) {
	/* int limit=50;
	 long[] series= new long[limit];
	 series[0]=1;
	 series[1]=1;
	 
	 for(int i=2;i<limit;i++){
		 series[i]=series[i-1]+ series[i-2];
		 
	 }
	 System.out.println("fibonociseries upto:"+ limit);
	 for(int i=0;i<limit;i++){
		 System.out.println(series[i]+"");
	 }
	 */
	 
		int limit=50;
		long series[]=new long[limit];
		series[0]=1;
		series[1]=1;
		
		for(int i=2;i<limit;i++){
			series[i]=series[i-1]+series[i-2];
			
		}
		System.out.println("Fibonociseriesr upto:"+limit);

		for(int i=0;i<limit;i++){
			System.out.println(series[i]+"");
		}
	}

}
