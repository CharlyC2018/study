package method;

public class TestMethod {

	public static void add(int x, int y) {
		int sum = 0;
		sum = x + y;
		System.out.println("sum = " + sum);
	}

	public static void paint() {
		System.out.println("I love U");
		System.out.println("520");
	}

	public static void main(String[] args) {

		add(5, 3);
		add(6, 2);
		add(8, 9);
		paint();
	}
}