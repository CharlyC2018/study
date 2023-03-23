package study;
//扩展运算符的用法
public class TestOperator2 {

	public static void main(String[] arg) {

		int a = 3;
		int b = 4;
		a += b;// 相当于a=a+b 
		System.out.println(a);

		a = 3;
		a *= b + 3;// 相当于a=a*(b+3)
		System.out.println(a);
	}

}