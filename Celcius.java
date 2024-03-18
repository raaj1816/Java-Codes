package programing;

import java.util.Scanner;

public class Celcius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		int C = sc.nextInt();
		double F=(C*(9/5))+32;
		System.out.printf("%.1f",F);
	}

}
