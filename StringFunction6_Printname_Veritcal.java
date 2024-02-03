package classwork;

public class StringFunction6_Printname_Veritcal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="My name is Ramu";
		
		for(int i=0 ;i<name.length()-1;i++)
		{
			if(name.charAt(i)!= ' ')
			{
				System.out.print(name.charAt(i));
			}
			
			else
			{
				System.out.println(" ");
			}
			
			
			
		}
	}

}
