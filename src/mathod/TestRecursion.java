package mathod;

public class TestRecursion {

	public static void main(String[] args) {
		Long startTime = System.currentTimeMillis();
		int a = factorial(20);
		Long endTime = System.currentTimeMillis();
		System.out.println(a);
		System.out.println("µÝ¹éºÄÊ±" + (endTime - startTime));
	}

	public static int factorial(int x) {

		if (x == 0) {
			return 1;
		} else {
			return x * factorial(x - 1);
		}

	}
}
