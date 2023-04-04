package testInterface;

public interface Volant {
	int Fly_HEIGHT = 100;

	void fly();
}

interface Honest {
	void helpOther();
}

class GoodMan implements Honest {

	@Override
	public void helpOther() {
		System.out.println("�������̹���·");
	}
}

class BirdMan implements Volant {

	@Override
	public void fly() {
		System.out.println("���ڷ�");
	}
}

class Angel implements Volant, Honest {

	@Override
	public void helpOther() {
		System.out.println("angel.helpother");
	}

	@Override
	public void fly() {
		System.out.println("angel.fly");
	}

}

class Plane implements Volant {

	@Override
	public void fly() {
		System.out.println("plane.fly");
	}

}
