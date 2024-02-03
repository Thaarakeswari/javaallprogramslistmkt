package classwork;

import java.util.Arrays;

public class Copyarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] no= {10,20,30};
		int[] no2=new int[3];
		for(int i=0;i<=no.length-1;i++)
		{
			no2[i]=no[i];
		}
		System.out.println("the new array is " +Arrays.toString(no2));
		

	}

}
