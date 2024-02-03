package classwork;

import java.util.Arrays;

public class Reverse_3strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "This is Automation";
		String output[] = new String[3];
		String output1[] = name.split(" ", 3);
		System.out.println(Arrays.toString(output1));
		for (int i = output1.length - 1, k = 0; i >= 0; i--) {
			output[k] = output1[i];
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
