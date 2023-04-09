package innerClass;

public class TestStaticInnerClass {
	public static void main(String[] args) {
		Outer2.Inner2 inner = new Outer2.Inner2();
		inner.test();
	}
}

class Outer2 {
	@SuppressWarnings("unused")
	private int a = 10;
	private static int b = 20;

	//相当于外部类的一个静态成员
	static class Inner2 {
		public void test() {
			// System.out.println(a);//静态内部类不能访问外部类的普通属性
			System.out.println(b);//静态内部类可以访问外部类的静态属性
		}
	}
}