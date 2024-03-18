package programing;

import java.util.Scanner;

public class LeafYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    
    if(n%4==0 || n%100==0 || n%400==0)
    {
    	System.out.print("Leaf Year");
    }
    else
    {
    	System.out.print(" Not leap year");
    }
	}

}
