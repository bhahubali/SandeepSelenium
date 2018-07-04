package PracticePrograms;

import javax.rmi.ssl.SslRMIClientSocketFactory;

public class DisplayEvenNumbers {

	public static void main(String[] args) {
		
		for(int i=1;i<=50;i++){
			if(i%2==0){
				System.out.print(i+" ");
			}
		}
	}

}
