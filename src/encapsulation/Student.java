package encapsulation;

public class Student {

	public void study() {
		Person p = new Person();
		p.testPublic=1;
		p.testDefault=2;
		p.testProtected=3;
	}
}