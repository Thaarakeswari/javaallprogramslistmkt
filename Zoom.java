package classwork;

abstract class Google {
	abstract void username();
}

public class Zoom extends Google {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Zoom z1 = new Zoom();
		z1.username();
	}

	void username() {
		System.out.println("Login here");

	}

}
