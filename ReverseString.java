package classwork;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input="Reddy";
		String output="";
		for(int i=input.length()-1;i>=0;i--)
		{
			 output=output+input.charAt(i);
		}
		System.out.println(output);

	}

}
