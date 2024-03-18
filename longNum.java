package programing;

public class longNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 123456789;
		for (int i=2;i<=num; i++) {
		int count =0;
		while (num%i == 0) {
		count++;
		num/=i;
		}
		if (count >0){
		System.out.println (i+" "+count);
		}
		}
	}

}
