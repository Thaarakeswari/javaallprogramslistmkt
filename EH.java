package classwork;

public class EH {

	public static void main(String[] args) throws  NullPointerException{
		// TODO Auto-generated method stub
		int a=1; int b=0;
		int c;
		int no1[]=new int[1];
		 no1[0]=6;
		try
		{
			c=a/b;
			no1[2]=8;
			
		}
		catch(ArithmeticException a1)
		{
			System.out.println("AE");
		}
		
		
catch(ArrayIndexOutOfBoundsException a2)
		{
			System.out.println("array");
		}
		
		
	}

}
