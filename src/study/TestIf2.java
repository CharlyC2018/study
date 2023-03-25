package study;

/**
 * 测试if-else双分支结构
 * 
 */

public class TestIf2 {

	public static void main(String[] args) {
		double r = 4 * Math.random();
		double area = 3.14 * r * r;
		double circle = 2 * Math.PI * r;

		System.out.println("r=" + r);
		System.out.println("area=" + area);
		System.out.println("circle=" + circle);

		if (area >= circle) {
			System.out.println("面积大于等于周长");
		} else {
			System.out.println("面积小于周长");
		}

		int a = 3, b = 4;
		int c = a < b ? b : a;
		System.out.println(c);

		if (a < b) {
			c = b;
		} else {
			c = a;
		}
		System.out.println(c);
	}

}
