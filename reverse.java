package programing;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r=5, n=1;
		for(int i=1;i<=r;i++)
		{
			for(int j=r;j>1;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(n+" ");
				n++;
			}
			System.out.println();
		}
		
	}

}
