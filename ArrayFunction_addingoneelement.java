package classwork;

import java.util.Arrays;

public class ArrayFunction_addingoneelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {10,20,30,40,50};
		int output[]=new int[5];
		for(int i=0;i<a.length;i++)
		{
			output[i]=a[i];
			
			if(a[i]==50)
			{
				 a[i]=a[i]+5;
				
			}
			System.out.println(output[i]);
			
		
		}
		
		System.out.println(Arrays.toString(output));

	}

}
