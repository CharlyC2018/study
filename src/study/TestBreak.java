package study;

public class TestBreak {

	public static void main(String[] args) {

		int count = 0;//ѭ��������
		while (true) {
			int i = (int) (Math.random() * 100);
			System.out.println(i + " ");
			count++;//������
			if (i == 88) {
				System.out.println("count=" + count);
				break;
			}
		}

	}
}