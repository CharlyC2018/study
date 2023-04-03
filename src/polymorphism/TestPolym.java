package polymorphism;

//测试多态
public class TestPolym {
	public static void main(String[] args) {
		// animalCry(new Dog());
		// animalCry(new Cat());

		// 编译类型Animal 运行时类型Dog
		Animal animal = new Dog();// 向上转向（自动）
		animal.shout();
		Dog d = (Dog) animal;// 向下转型（强制）
		d.watchDoor();

		Animal animal1 = new Cat();
		animal1.shout();
		Cat e = (Cat) animal1;
		e.catchMouse();

		if (animal instanceof Cat) {
			//编译不会报错，运行会报异常：ClassCastException
			Cat f = (Cat) animal;
			f.catchMouse();
		}

	}

	static void animalCry(Animal a) {
		a.shout();
	}
}
