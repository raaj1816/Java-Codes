package programing;

import java.util.Scanner;

public class Cylinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int r=sc.nextInt();
		int h=sc.nextInt();
		double pi=3.142;
		double area = 2*pi*r*(r+h);
		System.out.printf("%.4f",area);
	}

}
