package study;

/**
 * ����if-else if���֧�ṹ
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
		 * int count = i + j + k; System.out.println("��һ�������ӣ�" + i);
		 * System.out.println("�ڶ��������ӣ�" + j); System.out.println("�����������ӣ�" + k);
		 * 
		 * // count = 15;
		 * 
		 * if (count >= 15) { System.out.println("����������������һ�ѣ�"); } else if (count >=
		 * 10) { System.out.println("����һ�㣡��������"); } else {
		 * System.out.println("�����������У��ؼҰ�"); }
		 * 
		 * System.out.println("����ĵ÷֣�" + count);
		 */
	}

}
