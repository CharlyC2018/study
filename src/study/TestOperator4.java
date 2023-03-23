package study;

//测试关系运算符的用法
public class TestOperator4 {

	public static void main(String[] arg) {
		boolean b1 = false;
		boolean b2 = true;
		System.out.println(b1 & b2);// 与
		System.out.println(b1 | b2);// 或
		System.out.println(!b2);
		System.out.println(b1 ^ b2);

		boolean b3 = 1 > 2 && (4 < 3 / 0);
		System.out.println(b3);

	}

}