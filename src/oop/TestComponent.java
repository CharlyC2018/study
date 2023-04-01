package oop;

public class TestComponent extends Object{
	
	
	
}
class Person2 {
	String name;
	int height;

	public void rest() {
		System.out.println("resting..");
	}
}

class Student2 /* extends Person2 */ {
	String major;
	
	Person2 person2 = new Person2();
	public void study() {
		System.out.println("studing...");
		person2.rest();
		System.out.println(person2.name);
	}

	public Student2(String name, int height, String major) {
		this.person2.name = name;
		this.person2.height = height;
		this.major = major;
	}
}