package oop;

/**
 * 
 * ����this���÷�
 *
 */

public class TestThis {
	int a, b, c;

	TestThis() {
		System.out.println("��Ҫ��ʼ������" + this);
	}

	TestThis(int a, int b) {
		this();// �����޲εĹ��췽�������ұ���λ�ڵ�һ��
		// a=a;//�����a����ָ�ľֲ����������ǳ�Ա����

		// �����������˳�Ա�����;ֲ��������������ռ��thisʹ������Ĵ������
		this.a = a;
		this.b = b;
	}

	TestThis(int a, int b, int c) {
		this(a, b);// ���ô��εĹ��췽�������ұ���λ�ڵ�һ��
		this.c = c;
	}

	void sing() {

	}

	void eat() {
		System.out.println("��ǰ����" + this);
		this.sing();
		System.out.println("eating");
	}

	public static void main(String[] args) {
		TestThis hi = new TestThis();
		hi.eat();
	}
}
