package programing;

import java.util.Scanner;

public class FactorialNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int fact=1;
		for(int i=n;i>0;i--)
		{
			
			if(n>0)
			{
			fact=fact*(i);
			}
		}
		System.out.print(fact);
	}

}
