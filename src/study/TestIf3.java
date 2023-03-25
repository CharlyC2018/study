package study;

/**
 * 测试if-else if多分支结构
 * 
 */

public class TestIf3 {

	public static void main(String[] args) {

		int age = (int) (Math.random() * 120 + 1);
		System.out.println("age=" + age);

		//age=44;
		
		if (age < 15) {
			System.out.println("child");
		} else if (age < 25) {
			System.out.println("young");
		} else if (age < 45) {
			System.out.println("middle");
		} else {
			System.out.println("old");
		}

		/*
		 * int i = (int) (Math.random() * 6 + 1); int j = (int) (Math.random() * 6 + 1);
		 * int k = (int) (Math.random() * 6 + 1);
		 * 
		 * int count = i + j + k; System.out.println("第一次掷骰子：" + i);
		 * System.out.println("第二次掷骰子：" + j); System.out.println("第三次掷骰子：" + k);
		 * 
		 * // count = 15;
		 * 
		 * if (count >= 15) { System.out.println("今天手气不错！再来一把！"); } else if (count >=
		 * 10) { System.out.println("手气一般！再来两把"); } else {
		 * System.out.println("今天手气不行，回家吧"); }
		 * 
		 * System.out.println("今天的得分：" + count);
		 */
	}

}
