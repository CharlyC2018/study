package study;

public class TestOperator {

	public static void main(String[] arg) {

		int a = 3;
		long b = 4;
		long c = a + b;//
		System.out.println(c);

		double d = 3 + 3.14;
		int d2 = 32 / 3;// 两个整数相除，只保留整数部分，没有四舍五入
		System.out.println(d);
		System.out.println(d2);

		//取余数
		int e = 10 % 3;// 取余操作。结果符号和左边操作数相同
		System.out.println(e);

		
		//测试自增、自减
		int g = 30;
		g++;// 相当于g=g+1
		System.out.println(g);
		g--;// 相当于g=g-1
		System.out.println(g);

		g = 10;
		int h = g++;// g++先赋值给h，后自增
		System.out.println(h);

		g = 10;
		h = ++g;// g++先自增，后赋值给h
		System.out.println(h);

	}

}