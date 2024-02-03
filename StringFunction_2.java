package classwork;

public class StringFunction_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method

		String name = "Thaarakeswari";
		String a = name.toUpperCase();
		System.out.println(a);

		String b = name.toLowerCase();
		System.out.println(b);

		System.out.println(a.equals(b));
		System.out.println(a.endsWith("i"));
		System.out.println(a.contains("es"));
		System.out.println(a.concat(" ").concat(b));
		System.out.println(name.length());

		for (int i = 0; i < name.length(); i++) {
			System.out.println(name.charAt(i));
		}

	}

}
