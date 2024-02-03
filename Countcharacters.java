package classwork;

import java.util.Arrays;

public class Countcharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="Hello";
		//String name1[]=name.split("",5);
		char[] name1 = name.toCharArray();
		char name2;
		char secondarrvalue;
		int count=0;
		System.out.println(Arrays.toString(name1));
		for(int i=0;i<name1.length;i++)
		{
			name2=name1[i];
			for(int j=0;j<name1.length;j++)
			{
				secondarrvalue = name1[j];
				if(name2==secondarrvalue)
				{
					count = count +1;
				}
			}
			System.out.print(name2 + "-"+ count +" ");
			count=0;
		}
		

	}

}
