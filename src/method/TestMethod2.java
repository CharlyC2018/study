package method;

public class TestMethod2 {

	public static double handleLate(int x, int y) {

		double sum = 0;
		
		if (x < 1) {
			return sum;
		}
		
		if (x >= 1 & x <= 10) {
			System.out.println("late");
		} else if (x >= 11 & x <= 20) {
			sum = 100;
		} else if (x >= 21 & x <= 30) {
			sum = 200;
		} else if (x > 30 & x < 60) {
			sum = y / 22.5 / 2;
		} else {
			sum = y / 22.5 * 3;
		}

		return sum;
	}

	public static void main(String[] args) {
		System.out.println("1����Ϊ��" + handleLate(1, 3000));
		System.out.println("2����Ϊ��" + handleLate(10, 3000));
		System.out.println("3����Ϊ��" + handleLate(11, 3000));
		System.out.println("4����Ϊ��" + handleLate(20, 3000));
		System.out.println("5����Ϊ��" + handleLate(21, 3000));
		System.out.println("6����Ϊ��" + handleLate(30, 3000));
		System.out.println("7����Ϊ��" + handleLate(45, 3000));
		System.out.println("8����Ϊ��" + handleLate(605, 3000));
		System.out.println("9����Ϊ��" + handleLate(59, 3000));
		System.out.println("10����Ϊ��" + handleLate(0, 3000));
	}
}