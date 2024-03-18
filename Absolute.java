package programing;

import java.util.Scanner;

public class Absolute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
		if(n>0)
		{
			System.out.println(n);
		}
		else
		{
			System.out.println(n*(-1));
		}
	}

}
