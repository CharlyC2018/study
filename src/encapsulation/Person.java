package encapsulation;

public class Person {
	private int testPrivate;
 	int testDefault;
	protected int testProtected;
	public int testPublic;

	public void test() {
		System.out.println(this.testPrivate);
	}
}