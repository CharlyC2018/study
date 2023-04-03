package abstractClass;

class Dog extends Animal1{

	@Override
	public void rest() {
		System.out.println("dog resting...");
	}

	@Override
	public void run() {
		System.out.println("dog running...");
	}
	
	public static void main(String[] args) {
		Animal1 a =new Dog();
		a.rest();
	}
}