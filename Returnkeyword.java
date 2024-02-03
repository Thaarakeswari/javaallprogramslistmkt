package classwork;

public class Returnkeyword {

	int add(int a, int b)
	{
		int sum=a+b;
		return sum;
	}
	
	double add(int a, double b)
	{
		double sum=a+b;
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Returnkeyword r1=new Returnkeyword();
		System.out.println(r1.add(6, 8));
		System.out.println(r1.add(10, 40));

	}

}
