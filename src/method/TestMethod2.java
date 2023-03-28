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
		System.out.println("1罚金为：" + handleLate(1, 3000));
		System.out.println("2罚金为：" + handleLate(10, 3000));
		System.out.println("3罚金为：" + handleLate(11, 3000));
		System.out.println("4罚金为：" + handleLate(20, 3000));
		System.out.println("5罚金为：" + handleLate(21, 3000));
		System.out.println("6罚金为：" + handleLate(30, 3000));
		System.out.println("7罚金为：" + handleLate(45, 3000));
		System.out.println("8罚金为：" + handleLate(605, 3000));
		System.out.println("9罚金为：" + handleLate(59, 3000));
		System.out.println("10罚金为：" + handleLate(0, 3000));
	}
}