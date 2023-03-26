package study;

public class TestBreak {

	public static void main(String[] args) {

		int count = 0;//循环的总数
		while (true) {
			int i = (int) (Math.random() * 100);
			System.out.println(i + " ");
			count++;//计数器
			if (i == 88) {
				System.out.println("count=" + count);
				break;
			}
		}

	}
}