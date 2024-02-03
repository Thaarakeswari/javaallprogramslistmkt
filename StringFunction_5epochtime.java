package classwork;

import java.util.Date;

public class StringFunction_5epochtime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d1=new Date();
		System.out.println(d1); //get current date
		
		System.out.println(d1.getTime());
		
		Date d2=new Date(d1.getTime());
		
		System.out.println(d2);  // present time
		
		Date d3=new Date(d1.getTime()+(1000*60*60*24*1)); //here 1 stands for 1 day
		
		System.out.println(d3);
		
	Date d4=new Date(d1.getTime()+(1000*60*60*24*2)); //here 2 stands for 2 day
		
		System.out.println(d4);
		
		String timeformat=d4.toString();
		
		System.out.println(timeformat);
		
		String day=timeformat.substring(0,3);
		
		
		
		
		//System.out.println(d1.after(1000*60*60*24*1));
		
		System.out.println(d1.after(d1));
		
		System.out.println(d1.getTime());
		

	}

}
