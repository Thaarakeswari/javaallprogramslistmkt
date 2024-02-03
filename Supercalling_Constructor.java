package classwork;

class Schoolss
{
	Schoolss(int a)
	{
		System.out.println("super most");
	}
}

class School extends Schoolss
{
	School()
	{
		super(7);
		System.out.println("School");
	}
}

public class Supercalling_Constructor extends School {
	
	Supercalling_Constructor()
	{
		System.out.println("Super"); 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Supercalling_Constructor();

	}

}
