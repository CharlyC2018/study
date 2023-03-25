package study;

public class TestWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * System.out.println("I love u"); 
		 * System.out.println("I love u");
		 * System.out.println("I love u");
		 */

		int i = 0;
		while (i < 3) {
			System.out.println("I love U." + i);
			i++;
		}

		int j = 1;
		int count = 0;

		while (j <= 100) {
			count = count + j;
			j++;
		}

		System.out.println(count);
	}
}