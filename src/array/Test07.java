package array;

import java.util.Arrays;

//ʹ�ö�ά���鱣��������
public class Test07 {
	public static void main(String[] args) {
		Object[] a1 = { 1001, "���", 18, "��ʦ", "2-14" };
		Object[] a2 = { 1002, "��С��", 19, "����", "10-10" };
		Object[] a3 = { 1003, "��С��", 20, "������", "5-5" };
		Object[][] emps = new Object[3][];
		emps[0] = a1;
		emps[1] = a2;
		emps[2] = a3;
		System.out.println(Arrays.toString(a1));
		System.out.println(Arrays.toString(a2));
		System.out.println(Arrays.toString(a3));

		for (int i = 0; i < emps.length; i++) {
			for (Object objects : emps[i]) {
				System.out.print(objects + "\t");
			}
			System.out.println();
		}
	}
}