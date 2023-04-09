package innerClass;

public class TestAnonymousInnerClass {
	public void test(A a) {
		a.run();
	}

	public static void main(String[] args) {

		TestAnonymousInnerClass t = new TestAnonymousInnerClass();

		t.test(new A() {

			@Override
			public void run() {
				System.out.println("��һ�������ڲ���");
			}
		});

		t.test(new A() {

			@Override
			public void run() {
				System.out.println("�ڶ��������ڲ���");
			}
		});
		
		t.test(new AImpl());
		
	}
}

interface A {
	void run();
}

class AImpl implements A {

	@Override
	public void run() {
		System.out.println("AImpl.run");
	}
}