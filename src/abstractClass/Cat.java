package abstractClass;

class Cat extends Animal1{

	@Override
	public void rest() {
		System.out.println("cat resting...");
	}

	@Override
	public void run() {
		System.out.println("cat running...");
	}
	
	public static void main(String[] args) {
		Animal1 a =new Cat();
		a.rest();
	}
}