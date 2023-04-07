package study;

public class TestString {

	public static void main(String[] args) {

		@SuppressWarnings("unused")
		String s0 = null;
		String s1 = "";
		String s2 = "java";
		String s3 = new String("java");

		// System.out.println(s0.length());//会报：空指针异常
		System.out.println(s1.length());
		System.out.println(s2.length());
		System.out.println(s3.length());

 		System.out.println(s2 == s3);
		System.out.println(s2.equals(s3));
	}

}
