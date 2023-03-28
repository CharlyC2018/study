package study;

public class TestFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int i=0;
		for (int i = 0; i < 3; i++) {
			System.out.println("I love U.");
		}

		int count = 0;
		for (int j = 0; j <= 100; j++) {
			count = count + j;
		}

		System.out.println(count);

		for (int i = 9; i > 0; i--) {
			System.out.print(i + "\t");
		}
		System.out.println("");

		for (int i = 90; i > 1; i -= 3) {
			if ((i % 3) == 0) {
				System.out.print(i + ",");
			}
		}
	}
}
