package programing;

import java.util.Scanner;

public class Twodigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 int n=sc.nextInt();
		 
		 if(n>=100 && n<=999 && n%2==0 && n%5==0 && n%10==0)
		 {
			 System.out.println("s");
		 }
		 else
		 {
			 System.out.println("N");
		 }
	}

}
