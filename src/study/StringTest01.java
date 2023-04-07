package study;

public class StringTest01 {

	public static void main(String[] args) {
		String s1 = "core Java";
		String s2 = "Core Java";
		String s3 = "I love Java, Java is the best language.";

		System.out.println(s1.charAt(3));
		System.out.println(s2.length());
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.indexOf("Java"));
		System.out.println(s1.indexOf("apple"));
		
		System.out.println(s3.indexOf("Java"));
		System.out.println(s3.lastIndexOf("Java"));
		
		String s = s1.replace(' ', '&');
		System.out.println("result is:" + s);
		
	}
}