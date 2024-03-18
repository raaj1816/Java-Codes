package programing;

import java.util.Scanner;

public class prodsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int m=sc.nextInt();
		
		if(n%2==0 && m%2==0)
		{
			int prod=m*n;
			System.out.println(prod);
		}
		else
		{
			int sum=m+n;
			System.out.println(sum);
		}
	}

}
