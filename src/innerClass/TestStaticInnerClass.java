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

	//�൱���ⲿ���һ����̬��Ա
	static class Inner2 {
		public void test() {
			// System.out.println(a);//��̬�ڲ��಻�ܷ����ⲿ�����ͨ����
			System.out.println(b);//��̬�ڲ�����Է����ⲿ��ľ�̬����
		}
	}
}