package study;

//����λ��������÷��������ƣ�
public class TestOperator5 {

	public static void main(String[] arg) {
		int a = 7;
		int b = 8;
		System.out.println(a & b);
		System.out.println(a | b);
		System.out.println(a ^ b);
		System.out.println(~b);

		int c = 5 << 2;// �����5*2*2
		System.out.println(c);
		System.out.println(40 >> 3);// �����40/8

	}

}