package innerClass;

public class TestInner {
	public static void main(String[] args) {
		Outer.Inner o = new Outer().new Inner();
		o.show();
	}
}