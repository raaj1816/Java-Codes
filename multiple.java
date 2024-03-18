package programing;

import java.util.Scanner;

public class multiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
		if(n%5==0 && n%3==0 && n%7==0)
		{
			System.out.println("S");
		}
		else
		{
			System.out.println("N");
		}
				
	}

}
