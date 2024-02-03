package classwork;

class supermostclass
{
	void add()
	{
		System.out.println("Add method`1");
	}
	
	void sub()
	{
		System.out.println("sub method 2");
	}
}

class superclass extends supermostclass
{
	static void mul()
	{
		System.out.println("mul method 3");
	}
	static void div()
	{
		System.out.println("div method 4");
	}
	
}
public class Inheritance_Subclass extends superclass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inheritance_Subclass I1= new Inheritance_Subclass();
		I1.add1();
		I1.sub1();
		mul();
		div();
		I1.add();
		I1.sub();
	}
	
	void add1()
	{
		System.out.println("Add method 5");
	}
	void sub1()
	{
		System.out.println("sub method 6");
	}

}
