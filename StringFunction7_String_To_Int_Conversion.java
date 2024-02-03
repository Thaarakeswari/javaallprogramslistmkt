package classwork;

public class StringFunction7_String_To_Int_Conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="1234555";
		int num=Integer.parseInt(name); //converting string to Integer
		System.out.println(num);
		
		int a=888;
		String b=Integer.toString(a); //converting Integer to string
		System.out.println(b);
		
		char a1='A';
		int a2=Character.getNumericValue(a1); //converting character to int
		System.out.println(a2);
		
		int a3=65;
		char a4=(char)a3; //converting int to character
		System.out.println(a4);
		
		

	}

}
