package classwork;

public class Sumofdigits {

	public static void main(String[] args) {
		// 123 = 6
		
		int number=679;
		int sum=0;
		
		for(int i=1;i<=3;i++)
		{
			int rem=number%10;
			sum=sum+rem;
		number=number/10;
		}
		System.out.println(sum);
		

	}

}
