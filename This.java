package classwork;

public class This {
	int age;
	String name;
	double salary;
	void add(int age, String name, double Salary)
	{
		this.age=age; //This keyword global values assigned with the local values.
		this.name=name;
		this.salary=Salary;
		System.out.println("Ram");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		This T1=new This();
		T1.add(25,"Priya",4444.77);
		System.out.println(T1.age);
		System.out.println(T1.name);
		System.out.println(T1.salary);

	}

}
