package classwork;

import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//0 1 1 2 3 5
		int fiboo;
Scanner s1=new Scanner(System.in);
System.out.println("Enter fibonacci series");
fiboo=s1.nextInt();


int[] array1=new int[fiboo];

array1[0]=0;
array1[1]=1;



for(int i=2;i<fiboo;i++)
{
	array1[i]=array1[i-1]+array1[i-2];
	
}

for(int i=0;i<fiboo;i++)
{
	System.out.println(array1[i]);
}

//System.out.println(Arrays.toString(array1));




	}

}
