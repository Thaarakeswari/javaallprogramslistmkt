package classwork;

public class Method_overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
add(6,9);
Method_overloading M1=new Method_overloading(5,7.9,9.8f);
new Method_overloading(5.9,7.9,9.8f);
M1.add(9, 9, 4);

	}
	
	static void add(int a, int b)
	{
		int sum=a+b;
		System.out.println("value"+sum);
	}
	
	void add(int a, int b ,int c)

	{
		int sum=a+b+c;
		System.out.println("value"+sum);
	}
	Method_overloading(int a, double b, float c)
	{
		double sum=a+b+c;
		System.out.println("constructor add"+sum);
	}
	Method_overloading(double a, double b, float c)
	{
		double sum=a+b+c;
		System.out.println("constructor addition "+sum);
	}
	
	
}
