package study;

public class TestTpyeAutoConvert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 2345;
		long b = a;
		@SuppressWarnings("unused")
		int c = (int)b;
		double d = b;
		float f = b;
		System.out.println(a);
		System.out.println(b);
		System.out.println(d);
		System.out.println(f);

		@SuppressWarnings("unused")
		byte h1 = 123;
		char h3 = 97 + 25;
		System.out.println(h3);
	}

}
