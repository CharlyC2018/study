package oop;

import java.util.Objects;

public class TestObject {
	int id;
	String name;
	String pwd;

	public TestObject(int id, String name, String pwd) {
		this.id = id;
		this.name = name;
		this.pwd = pwd;
	}

	TestObject() {
	}

	public String toString() {
		return "name:" + name + ",pwd:" + pwd;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, pwd);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TestObject other = (TestObject) obj;
		return id == other.id && Objects.equals(name, other.name) && Objects.equals(pwd, other.pwd);
	}

	public static void main(String[] args) {
		TestObject t = new TestObject(1001, "charly", "123456");
		// System.out.println(t.toString());
		TestObject t1 = new TestObject(1001, "charly", "123456");
		// System.out.println(t1.toString());
		// System.out.println(t1);// 默认调用toString方法

		System.out.println(t.equals(t1));

	}
}