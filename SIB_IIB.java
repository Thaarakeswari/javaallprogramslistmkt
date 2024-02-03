package classwork;

public class SIB_IIB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


new SIB_IIB();
new SIB_IIB(4);
//to call IIB and constructor
//System.out.println("Main block");
}
	
	static {
		System.out.println("Static block"); //static block
	}
	static {
		System.out.println("Static block 1"); //static block
	}
	
	{
		System.out.println("IIB block"); //IIB
	}
	{
		System.out.println("IIB block 1"); //IIB
	}
	
	 SIB_IIB()
	{
		System.out.println("constructor block"); //constructor
	}
	 
	 SIB_IIB(int a)
		{
			System.out.println("constructor block 1"); //constructor
		}
}
