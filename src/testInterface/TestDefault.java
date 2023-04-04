package testInterface;

public interface TestDefault {
	void printInfo();

	default void moren() {
		System.out.println("TestDefault.moren");
	}
	
	public static void TestStatic01() {
		System.out.println("TestDefault.TestStatic01");
	}
}

class TestDefault01 implements TestDefault {

	@Override
	public void printInfo() {
		System.out.println("TestDefault01.printInfo()");
	}
	
	public static void TestStatic01() {
		System.out.println("TestDefault01.TestStatic01");
	}

}