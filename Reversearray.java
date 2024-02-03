package classwork;

import java.util.Arrays;

public class Reversearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] no= {10,20,30};
		String n="Thaara";
		
		
		int[] no2=new int[no.length];
		for(int i=no.length-1,k=0;i>=0;i--)
		{
			no2[k]=no[i];
			k++;
			
		}
		System.out.println("the reverse array is " +Arrays.toString(no2));
		

	}

	}


