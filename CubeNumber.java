package programing;

import java.util.Scanner;

public class CubeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			int a=i*i*i;
			System.out.print(a+" ");
		}
	}

}
