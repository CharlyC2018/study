package innerClass;

public class TestLocalInnerClass {
	public void show() {
		//作用域仅限于该方法
		class Inner3 {
			public void fun() {
				System.out.println("hello world");
			}
		}
		new Inner3().fun();
	}

	public static void main(String[] args) {
		new TestLocalInnerClass().show();
	}
}