package study;

import java.util.Scanner;

public class SalaryCalculator {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);

		while (true) {

			System.out.print("��������н");
			int salary = s.nextInt();

			System.out.print("ÿ���Ƕ���н");
			int month = s.nextInt();

			System.out.println("�û�����н��:" + salary * month);

			if (salary * month >= 100000 & salary * month < 200000) {
				System.out.println("��ϲ�㳬��90%�Ĺ���");
			} else if (salary * month >= 200000) {
				System.out.println("��ϲ�㳬��98%�Ĺ���");
			}
			
			System.out.println("����88���˳�ϵͳ\n����66����������");
			int input = s.nextInt();

			if (input == 66) {
				System.out.println("���¿�ʼ����");
				continue;
			}

			if (input == 88) {
				System.out.println("�˳�����");
				break;
			}

		}
	}
}