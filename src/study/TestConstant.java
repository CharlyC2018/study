package study;

public class TestConstant {

	public static void main(String[] args) {
		final double PI = 3.1415;
		final int MAX_SPEED = 120;

		double r = 4;
		double area = r * r * PI;
		double circle = 2 * PI * r;
		// PI = 3.15;
		System.out.println(PI);
		System.out.println(MAX_SPEED);
		System.out.println("area=" + area);
		System.out.println("circle=" + circle);

	}
}