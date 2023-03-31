package oop;

/**
 * 
 * @author Charly
 * @time 2023-03-29 10:01:40 一个学生类
 *
 */

public class SxtStu {
	int id;
	int age;
	String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void study() {
		System.out.println("studing......");
	}

	public void playBall() {
		System.out.println("playing ball.");
	}

	public void paint() {
		System.out.println(name + ", age:" + age + ", ID:" + id);
	}

	public static void main(String[] args) {
		SxtStu s = new SxtStu();
		s.setName("Jam");
		s.setAge(15);
		s.setId(9003);
		s.paint();
		s.study();
		s.playBall();
	}

}