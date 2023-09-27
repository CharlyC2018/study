package testException;

import exception.IllegalAgeException;

class Person {
	private String name;
	private int age;

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) throws IllegalAgeException {
		if (age < 0) {
			throw new IllegalAgeException("人的年龄不应该为负数");
		}
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
}

public class TestMyException {
	public static void main(String[] args) {
		Person p = new Person();
		p.setName("charly");
		try {
			p.setAge(5);
		} catch (IllegalAgeException e) {
			e.printStackTrace();
		}
		System.out.println(p);
	}
}
