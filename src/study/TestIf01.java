package study;

public class TestIf01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = (int) (Math.random() * 6 + 1);
		int j = (int) (Math.random() * 6 + 1);
		int k = (int) (Math.random() * 6 + 1);

		int count = i + j + k;
		System.out.println("��һ�������ӣ�" + i);
		System.out.println("�ڶ��������ӣ�" + j);
		System.out.println("�����������ӣ�" + k);

		// count = 15;

		if (count >= 15) {
			System.out.println("����������������һ�ѣ�");
		}

		if (count >= 10 & count < 15) {
			System.out.println("����һ�㣡��������");
		}

		if (count < 10) {
			System.out.println("�����������У��ؼҰ�");
		}

		System.out.println("����ĵ÷֣�" + count);

	}

}
