package oop;

public class TestStatic2 {
	static String company;
	static {
		System.out.println("执行类的初始化工作");
		company = "charly";
		paintCompany();
	}

	public static void paintCompany() {
		System.out.println(company);
	}

	public static void main(String[] args) {

	}
}