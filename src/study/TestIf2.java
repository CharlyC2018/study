package study;

/**
 * ����if-else˫��֧�ṹ
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
			System.out.println("������ڵ����ܳ�");
		} else {
			System.out.println("���С���ܳ�");
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
