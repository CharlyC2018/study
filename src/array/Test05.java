package array;

import java.util.Arrays;

//����Arrays��
public class Test05 {
	public static void main(String[] args) {
		int[] a = { 1, 2 };
		System.out.println(a);
		System.out.println(Arrays.toString(a));// ��ӡ����
		for (int i : a) {
			System.out.println(i);
		}

		int[] b = { 1, 2, 323, 23, 543, 12, 59 };
		System.out.println(Arrays.toString(b));
		Arrays.sort(b);// ��������
		System.out.println(Arrays.toString(b));
		// ����������µ�����λ�ã���δ�ҵ����ظ���
		System.out.println("index is:" + Arrays.binarySearch(b, 12));

		int[] c = { 1, 2, 323, 23, 543, 12, 59 };
		System.out.println(Arrays.toString(c));
		Arrays.fill(c, 2, 4, 100);// ��[2,4)������Ԫ���滻Ϊ100
		System.out.println(Arrays.toString(c));
	}
}