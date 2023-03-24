package study;

public class TestIf01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = (int) (Math.random() * 6 + 1);
		int j = (int) (Math.random() * 6 + 1);
		int k = (int) (Math.random() * 6 + 1);

		int count = i + j + k;
		System.out.println("第一次掷骰子：" + i);
		System.out.println("第二次掷骰子：" + j);
		System.out.println("第三次掷骰子：" + k);

		// count = 15;

		if (count >= 15) {
			System.out.println("今天手气不错！再来一把！");
		}

		if (count >= 10 & count < 15) {
			System.out.println("手气一般！再来两把");
		}

		if (count < 10) {
			System.out.println("今天手气不行，回家吧");
		}

		System.out.println("今天的得分：" + count);

	}

}
