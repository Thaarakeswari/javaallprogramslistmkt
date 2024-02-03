package classwork;

public class StringFunction_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a="World";
		String b="wordl";
		System.out.println(a.equalsIgnoreCase(b));
		boolean c=a.equals(b);
		System.out.println(c);
		
		String name="";
		System.out.println(name.isEmpty());
		
		String name1="Thaarakeswari2708";
				String output=name1.replace("[a-z]", " ");

	}

}
