package classwork;

public class Reversestring_p3 {
	// to print count of vowels
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "violet";

		int output = 0;

		for (int i = 0; i < name.length(); i++) {

			if (name.charAt(i) == 'a' || name.charAt(i) == 'e' || name.charAt(i) == 'i' || name.charAt(i) == 'o'
					|| name.charAt(i) == 'u') {
				output++;

			}
		}

		System.out.println(" No of vowels in a string: " + output);
	}

}
