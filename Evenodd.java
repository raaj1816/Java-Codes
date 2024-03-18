package programing;

import java.util.Scanner;

public class Evenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
		if(n%10==0)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("NO");
		}
	}

}
