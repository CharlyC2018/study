package study;

//������������Ԫ����������÷�
public class TestOperator7 {

	public static void main(String[] arg) {
		int score = 90;
		String tpye = score < 60 ? "������" : "����";
		System.out.println(tpye);

		score = 59;
		if (score < 60) {
			tpye = "������";
			System.out.println(tpye);
		} else {
			tpye = "����";
			System.out.println(tpye);
		}

		int x = -100;
		int flag = x > 0 ? 1 : (x == 0 ? 0 : -1);
		System.out.println(flag);

		boolean s1 = true, s2 = true, s3 = false;
		System.out.println(s1 || s2 && s3);// �߼����������>��>��

		boolean s4 = (3 > 1 | 4 > 3) & (3 < 5);
		System.out.println(s4);

	}

}