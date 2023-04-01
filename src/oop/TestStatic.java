package oop;
/**
 * 
 * ����static
 *
 */
public class TestStatic {
	int id;
	String name;
	
	static String company="charly";
	
	public TestStatic (int id,String name) {
		this.id=id;
		this.name=name;
	}
	
	public void login() {
		System.out.println(name);
	}
	
	public static void paintCompany() {
		//login();//���÷Ǿ�̬��Ա���������ᱨ��
		System.out.println(company);
	}
	
	public static void main(String[] args) {
		TestStatic u= new TestStatic(331, "cc");
		System.out.println(u.name);
		TestStatic.paintCompany();
		TestStatic.company="Charly";
		TestStatic.paintCompany();
	}
}
