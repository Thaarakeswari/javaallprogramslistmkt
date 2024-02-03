package classwork;

public class Local_Global {

	static int age=30;
	 double salary=78888.99;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age1;
		age1=10;
		System.out.println(age1);
System.out.println(age);
Local_Global l1=new Local_Global();
l1.salary=9000.89;

System.out.println(l1.salary); //non static variable inside static can be called with the help of reference variable

age=56;//static so directly we can change
System.out.println("Age vale changed from 30 to "+age);
		
		
		

	}

}
