//Write a program to call constructor and call static method and non static method in one class.

package classwork;

public class World {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		World w1=new World();
		w1.World();
		w1.World(5);
		Methodover("This is static method");
		
		w1.Methodover(8);
		
	}
	
	void World()// constructor 
	{
	System.out.println("No value");
	}
	
void World(int a) //parameterized constructor
{
	int b=30;
	int sum = a+100+b;
	System.out.println( +sum);
}

static void Methodover(String e) //static method 
{
	System.out.println(e);
}
void Methodover( int a) //non static method
{
	System.out.println(a);
}
}
