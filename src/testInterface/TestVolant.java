package testInterface;

public class TestVolant {

	public static void main(String[] args) {
		Plane plane = new Plane();
		Angel angel = new Angel();
		angel.fly();
		angel.helpOther();
		plane.fly();
		System.out.println(Volant.Fly_HEIGHT);

		TestDefault01 test = new TestDefault01();
		test.moren();
		test.printInfo();
		
		TestDefault.TestStatic01();
		TestDefault01.TestStatic01();
	}
}