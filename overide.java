package classwork;

class mkt
{
	protected void java()
	{
		System.out.println("java");
	}
}

public class overide extends mkt {
	
	
public void java()
{
	System.out.println("java1");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		overide o1=new overide();
		o1.java();
	}

}
