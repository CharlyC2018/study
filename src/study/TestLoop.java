package study;

public class TestLoop {

	public static void main(String[] args) {
		for (int i = 0; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print(i + "\t");
			}
			System.out.println("");
		}

		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + "*" + i + "=" + (i * j < 10 ? (" " + i * j) : (i * j)) + "\t");
			}
			System.out.println();
		}

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {

//				if (i % 2 == 1 && j % 2 == 1) {
//					System.out.print("*" + " ");
//				} else if (i % 2 == 1 && j % 2 == 0) {
//					System.out.print("#" + " ");
//				} else if (i % 2 == 0 && j % 2 == 1) {
//					System.out.print("#" + " ");
//				} else {
//					System.out.print("*" + " ");
//				}

				if ((i + j) % 2 == 1) {
					System.out.print("#" + " ");
				} else {
					System.out.print("*" + " ");
				}
			}
			System.out.println();
		}
	}
}