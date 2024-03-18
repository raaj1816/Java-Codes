package programing;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int n=n/2;
		
		int n1=0;
		int n2=1;
		
		
		for(int i=1;i<=n;i++)
		{
			System.out.print(n1+" "+n2+" ");
			 n1=n2+n1;
			 n2=n1+n2;
			
		}
		
	}

}
