package classwork;

public class Countcharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="Hello";
		
		int name1=0;
		
		for(int i=0;i<name.length();i++)
		{
			if(name.charAt(i)!=' ')
			{
				name1++;
			}
			
		}
		System.out.println(name1);
		
	}

}
