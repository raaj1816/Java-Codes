package programing;

public class inc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5;
		System.out.println((a++)+a);
		
		
		
		int b=(a++)+(++a)+(a++)+(++a);
		
		System.out.println(b);
		System.out.println(a);
		
		int c=(++a)+10;
		
		System.out.println(c);
	}

}
