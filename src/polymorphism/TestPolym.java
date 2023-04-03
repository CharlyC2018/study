package polymorphism;

//���Զ�̬
public class TestPolym {
	public static void main(String[] args) {
		// animalCry(new Dog());
		// animalCry(new Cat());

		// ��������Animal ����ʱ����Dog
		Animal animal = new Dog();// ����ת���Զ���
		animal.shout();
		Dog d = (Dog) animal;// ����ת�ͣ�ǿ�ƣ�
		d.watchDoor();

		Animal animal1 = new Cat();
		animal1.shout();
		Cat e = (Cat) animal1;
		e.catchMouse();

		if (animal instanceof Cat) {
			//���벻�ᱨ�����лᱨ�쳣��ClassCastException
			Cat f = (Cat) animal;
			f.catchMouse();
		}

	}

	static void animalCry(Animal a) {
		a.shout();
	}
}
