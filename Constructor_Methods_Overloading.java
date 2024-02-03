package classwork;

public class Constructor_Methods_Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Constructor_Methods_Overloading();
		new Constructor_Methods_Overloading(3,4);
		new Constructor_Methods_Overloading(6.9,8.0);
		
	}
	
	Constructor_Methods_Overloading()
	{
		System.out.println("Non parameter constructor");
	}
	
	 Constructor_Methods_Overloading(int a, int b)
	{
		
		System.out.println(a+b);
	}
	Constructor_Methods_Overloading(double a, double b)
	{
		System.out.println(b-a);
	}

}
