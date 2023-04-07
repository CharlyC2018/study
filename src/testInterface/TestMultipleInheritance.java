package testInterface;

public class TestMultipleInheritance {

	public static void main(String[] args) {
		C c = new cImpl01();
		c.a();
		c.b();
		c.c();
	}
}

interface A {
	void a();
}

interface B {
	void b();
}

interface C extends A, B {
	void c();
}

class cImpl01 implements C {

	@Override
	public void a() {

	}

	@Override
	public void b() {

	}

	@Override
	public void c() {

	}
}