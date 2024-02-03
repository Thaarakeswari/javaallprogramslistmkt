package classwork;

public class exceptionhandling  {

	public static void main(String[] args) throws ArithmeticException,ArrayIndexOutOfBoundsException,NullPointerException{
		// TODO Auto-generated method stub
		int b[]=new int[1];
try
{
	int a=1/0;
	 
}

catch(ArithmeticException re)
{
	System.out.println("Ari");
}
try
{
	b[0]=10;
	 b[1]=20;
	for(int i=0;i<=b.length;i++)
	{
		System.out.println(b[i]);
	}
}

catch(ArrayIndexOutOfBoundsException re1)
{
	System.out.println("Arar");
}
finally
{
	System.out.println("output final");
}

throw new NullPointerException("check throw");
	}

}
