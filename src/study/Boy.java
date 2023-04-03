package study;

import encapsulation.Person;

public class Boy extends Person {

	public void play() {
		System.out.println(super.testProtected);
		System.out.println(super.testPublic);

		Person p = new Person();
		System.out.println(p.testPublic);
		// 关于protected的两个细节
		// 若父类和子类在同一个包中，子类可访问父类/父类对象的protected成员
		// 若父类和子类不在同一个包中，子类可访问父类的protected成员
		// 但是不能访问父类对象的protected成员
	}
}