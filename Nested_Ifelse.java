package classwork;

public class Nested_Ifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age = 77;
		char gender = 'M';
		char gender1 = 'F';

		if (age > 65) {
			if (gender == 'M') {

				System.out.println("Male give 75% fees");
			}

			else {
				System.out.println("Age of male  not greater than 65");
			}

			if (age > 65) {
				if (gender1 == 'F') {

					System.out.println("Female give free");
				} else {
					System.out.println(" age of female not greater than  65");
				}

			}
		} else {
			System.out.println("adult person");
		}

	}

}
