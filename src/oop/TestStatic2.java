package oop;

public class TestStatic2 {
	static String company;
	static {
		System.out.println("ִ����ĳ�ʼ������");
		company = "charly";
		paintCompany();
	}

	public static void paintCompany() {
		System.out.println(company);
	}

	public static void main(String[] args) {

	}
}