package classwork;

import java.util.Scanner;

public class Scanner_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		System.out.print("Enter byte value");
		byte a=s1.nextByte();
		
		
		
		System.out.print("Enter short value");
		short b=s1.nextShort();
		
		

		s1.close();
	}

}
