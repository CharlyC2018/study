package oop;
/**
 * 
 * ≤‚ ‘ºÃ≥–
 *
 */
public class TestExtends {
	public static void main(String[] args) {
		Student s = new Student("charly", 160, "computer");
		s.study();
	}
}

class Person {
	String name;
	int height;

	public void rest() {
		System.out.println("resting..");
	}
}

class Student extends Person {
	String major;

	public void study() {
		System.out.println("studing...");
		rest();
		System.out.println(name);
	}

	public Student(String name, int height, String major) {
		this.name = name;
		this.height = height;
		this.major = major;
	}
}

class boy extends Person {

}