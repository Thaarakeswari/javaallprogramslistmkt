package classwork;

class Friends {
	void add() {
		System.out.println("Add");
	}
}

class Friends1 extends Friends {
	void sub() {
		System.out.println("sub");
	}
}

class Friends2 extends Friends1 {
	void div() {
		System.out.println("div");
	}
}

public class Upcaseset_5 extends Friends2 {

	void mul() {
		System.out.println("mul");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// upcast
		Friends1 f1 = new Friends2();
		f1.add();
		f1.sub();
		// downcast
		Friends2 f2 = (Friends2) f1;
		f2.add();
		f2.sub();
		f2.div();

	}

}
