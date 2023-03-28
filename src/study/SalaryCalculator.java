package study;

import java.util.Scanner;

public class SalaryCalculator {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);

		while (true) {

			System.out.print("请输入月薪");
			int salary = s.nextInt();

			System.out.print("每年是多少薪");
			int month = s.nextInt();

			System.out.println("用户的年薪是:" + salary * month);

			if (salary * month >= 100000 & salary * month < 200000) {
				System.out.println("恭喜你超过90%的国人");
			} else if (salary * month >= 200000) {
				System.out.println("恭喜你超过98%的国人");
			}
			
			System.out.println("输入88，退出系统\n输入66，继续计算");
			int input = s.nextInt();

			if (input == 66) {
				System.out.println("重新开始计算");
				continue;
			}

			if (input == 88) {
				System.out.println("退出程序");
				break;
			}

		}
	}
}