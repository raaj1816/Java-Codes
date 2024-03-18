package programing;

import java.util.Scanner;

public class reversenumber {
	
	static void reverseNumber(int n)
	
	{
		int rev=0;
		while(n>0)
		{
			int rem=n%10;
			 rev=rev*10+rem;
			n=n/10;
			System.out.print(rem);
		}
		
	}
	
	static int addNumber(int n1, int n2)
	{
		int a=n1+n2;
		return a;
	}
	
	static void evenOdd(int n3)
	{
		if(n3%2==0)
		{
			System.out.print("Even");
		}
		else
		{
			System.out.print("Odd");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		reverseNumber(n);
		
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		
		System.out.println(addNumber(n1,n2));
		int n3=sc.nextInt();
		evenOdd(n3);
		
	}

}
