package polymorphism;

public class Animal {
	public void shout() {
		System.out.println("Ω–¡À“ª…˘£°");
	}
}

class Dog extends Animal {
	public void shout() {
		System.out.println("wof,wof");
	}

	public void watchDoor() {
		System.out.println("wathing door...");
	}
}

class Cat extends Animal {
	@Override
	public void shout() {
		System.out.println("mew mew");
	}
	
	public void catchMouse() {
		System.out.println("catching mouse");
	}
}