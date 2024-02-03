package classwork;

import java.util.Arrays;

public class Reversestring_p1 {

	public static void main(String[] args) {
		
		// Input: Automation Testing Program
		// output: Program Testing Automation.

		String name = "Automation Testing Program";
		String name1[] = name.split(" ", 3);
		System.out.println(Arrays.toString(name1));
		String output[] = new String[3];

		for (int i = name1.length - 1, k = 0; i >= 0; i--) {
			output[k] = name1[i];
			k++;
		}

		System.out.println(Arrays.toString(output));

		String s = "";
		for (int i = 0; i < output.length; i++) {
			s = s + " " + output[i];
		}
		System.out.println(s);

	}

}
