package classwork;

class Student
{
	public void java()
	{
		System.out.println("Learn java");
	}
}

public class override extends Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		override o1=new override();
		o1.java();
	
		

	}
	
	public void java()
	{
		System.out.println("Teach java");
		super.java();
	}

}
