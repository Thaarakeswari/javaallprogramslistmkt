package classwork;

import java.util.Arrays;

public class ReverseString_p2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Automation Testing Program
		//noitam    gin  
		
		String name="Automation Testing Program";
		String name1[]=name.split(" ",3);
		System.out.println(Arrays.toString(name1));
		String s1="";
		String s2="";
		
		for(int i=0;i<name1.length;i++)
		{
			s1=s1+name1[i];
			for(int j=s1.length()-1;j>=0;j--)
			{
				s2=s2+s1.charAt(j);
			}
		}
		System.out.println(s1);
		System.out.println(s2);
		
		/*for(int i=name1.length;i>=0;i--)
		{
			s1=s1+name1
		}*/
		
		
		

	}

}
