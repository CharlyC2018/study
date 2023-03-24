package study;

import java.util.Scanner;

public class TestScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.print("please enter username:");
		String username= s.nextLine();
		System.out.println("username:"+username);
	}

}
