package study;

public class TestOperator {

	public static void main(String[] arg) {

		int a = 3;
		long b = 4;
		long c = a + b;//
		System.out.println(c);

		double d = 3 + 3.14;
		int d2 = 32 / 3;// �������������ֻ�����������֣�û����������
		System.out.println(d);
		System.out.println(d2);

		//ȡ����
		int e = 10 % 3;// ȡ�������������ź���߲�������ͬ
		System.out.println(e);

		
		//�����������Լ�
		int g = 30;
		g++;// �൱��g=g+1
		System.out.println(g);
		g--;// �൱��g=g-1
		System.out.println(g);

		g = 10;
		int h = g++;// g++�ȸ�ֵ��h��������
		System.out.println(h);

		g = 10;
		h = ++g;// g++����������ֵ��h
		System.out.println(h);

	}

}