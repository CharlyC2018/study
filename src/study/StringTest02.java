package study;

public class StringTest02 {

	public static void main(String[] args) {
		String s = "";
		String s1 = "How are you?";

		System.out.println(s1.startsWith("How"));
		System.out.println(s1.endsWith("you"));
		s = s1.substring(4);
		System.out.println(s);
		s = s1.substring(4, 7);//提取字符串：下标[4,7)不包括7
		System.out.println(s);
		s = s1.toLowerCase();
		System.out.println(s);
		s = s1.toUpperCase();
		System.out.println(s);
		String s2 = " How old are you!!";
		s = s2.trim();
		System.out.println(s);
		System.out.println(s2);

	}
}