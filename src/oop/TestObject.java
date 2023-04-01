package oop;

public class TestObject {
	String name;
	String pwd;

	public String toString() {
		return "name:" + name + ",pwd:" + pwd;
	}

	public static void main(String[] args) {
		TestObject t = new TestObject();
		System.out.println(t.toString());
		TestObject t1 = new TestObject();
		System.out.println(t1.toString());
		System.out.println(t1);// 默认调用toString方法
	}
}