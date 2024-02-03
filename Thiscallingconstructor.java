package classwork;

public class Thiscallingconstructor {
	Thiscallingconstructor()
	{
		System.out.println("Hii");
	}
	Thiscallingconstructor(int a)
	{
		this();
		System.out.println("Hello");
	}
	
	Thiscallingconstructor(double b)
	{
		
		this();
		
		
		
		
		
		
		System.out.println(b);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Thiscallingconstructor(0.9);

	}

}
