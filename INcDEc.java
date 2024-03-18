package programing;

public class INcDEc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=0100;
		int y=010;
		int z= 010;
		int i=(--x)+(y++)-(z--)-(--z)+(++y)-(--x)+(y--)-(--x);
		System.out.println(i);
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);

	}

}
