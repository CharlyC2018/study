package oop;

public class TestSuper02 {
	public static void main(String[] args) {
		new ChildClass2();
	}
}

class FatherClass2 {
	static {
		System.out.println("静态初始化FatherClass2");
	}

	public FatherClass2() {
		System.out.println("create FatherClass2");
	}
}

class ChildClass2 extends FatherClass2 {
	static {
		System.out.println("静态初始化ChildClass2");
	}

	public ChildClass2() {
		System.out.println("create ChildClass2");
	}
}