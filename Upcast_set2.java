package classwork;
class super1
{
	void add()
	{
		
	}
}
class super2 extends super1
{
	void sub()
	{
		
	}
}

public class Upcast_set2 extends super2 {
	
	void mul()
	{
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		super1 s1	=new Upcast_set2();
		s1.add();
		
		
		
		
		
		//****downcast***
		
		Upcast_set2 s2=(Upcast_set2) s1;
		s2.add();
		s2.mul();
		s2.sub();
		
	}

}
