package classwork;

import java.util.Scanner;

public class Primenumber {

	public static void main(String[] args) {
		// PN it should not be divisbile by any number other than 1 and itself. It wont be 0.
		System.out.println(prime());
		
		
	}
	static	boolean prime()
		{
			int number;
			Scanner s1=new Scanner(System.in);
			System.out.println("Enter a number");
			number= s1.nextInt();
		if(number <=1)
		{
			
			return false;
		}
		else 
		{
			for(int i=2; i<number;i++)
			{
				if(number% i == 0)
				{
				
					return false;
				}
			}
			return true;
		}
		
			
		}
	}


