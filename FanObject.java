package programing;

import java.util.Scanner;

class Fan
{
	private String Brand;
	private String color;
	private int cost;
	private int Speed;
	
	 
	 Fan(String a, String b, int c, int d)
		{
			
			this.Brand =a;
			this.color=b;
			this.cost=c;
			this.Speed=d;
			
		}

	 
	 public  void Display(String p)
	 {
		 int q=Integer.parseInt(p);
		 if(p!=null)
		 {
			if(p.equals(Brand))
			{
				System.out.println(color+" "+Speed+" "+cost);
			}
			else if(p.equals(color))
			{
				System.out.println(Brand+" "+Speed+" "+cost);
			}
			else if(q==Speed)
			{
				System.out.println(color+" "+Brand+" "+cost);
			}
			else if(q==cost)
			{
				System.out.println(color+" "+Speed+" "+Brand);
			}	
		 }
	 }
}


public class FanObject 
{

	public static void main(String[] args) 
	{
		System.out.println("Brands Name Available :");
		System.out.println("1)Usha  " +"2)Crompton  " +"3)Bajaj  ");
		
		
		Fan f1 = new Fan("Usha","Black",2000,500);
		Fan f2 = new Fan("Crompton","Green",600,505);
		Fan f3 =new Fan("Bajaj","Red",3000,510);
		
	Scanner s= new Scanner(System.in);
	
	while(true)
	{
		String p=s.next();
		
		f1.Display(p);
		f2.Display(p);
		f3.Display(p);
	}	
	}

}
