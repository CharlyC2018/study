package study;

//测试条件（三元）运算符的用法
public class TestOperator7 {

	public static void main(String[] arg) {
		int score = 90;
		String tpye = score < 60 ? "不及格" : "及格";
		System.out.println(tpye);

		score = 59;
		if (score < 60) {
			tpye = "不及格";
			System.out.println(tpye);
		} else {
			tpye = "及格";
			System.out.println(tpye);
		}

		int x = -100;
		int flag = x > 0 ? 1 : (x == 0 ? 0 : -1);
		System.out.println(flag);

		boolean s1 = true, s2 = true, s3 = false;
		System.out.println(s1 || s2 && s3);// 逻辑运算符：非>与>或

		boolean s4 = (3 > 1 | 4 > 3) & (3 < 5);
		System.out.println(s4);

	}

}