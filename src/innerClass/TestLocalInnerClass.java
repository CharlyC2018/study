package innerClass;

public class TestLocalInnerClass {
	public void show() {
		//����������ڸ÷���
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