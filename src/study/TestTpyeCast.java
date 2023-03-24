package study;

public class TestTpyeCast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 3.94152;
		int b = (int) a;
		System.out.println(b);

		int c = 97;
		char d = (char) c;
		System.out.println(d);

		byte e = (byte) 300;
		System.out.println(e);

		int money = 1000000000;
		int year = 20;

		int total = money * year;
		System.out.println("total=" + total);
		
		long total1=money*year;
		System.out.println("total1="+total1);
		long total2=money*(long)year;
		long total3=1L*money*year;
		System.out.println(total2);
		System.out.println(total3);
		

	}

}
