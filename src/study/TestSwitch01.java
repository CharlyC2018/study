package study;

public class TestSwitch01 {
	public static void main(String[] args) {

		int grate = (int) (Math.random() * 4 + 1);

		switch (grate) {
		case 1:
			System.out.println("freashman");
			break;
		case 2:
			System.out.println("大二");
			break;
		case 3:
			System.out.println("大三");
			break;
		case 4:
			System.out.println("大四");
			break;
		default:
			System.out.println("保安");
			break;
		}

		int month = (int) (Math.random() * 12 + 1);

		switch (month) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
			System.out.println(month + "月，属于上半年");
			break;
		default:
			System.out.println(month + "月，属于下半年");
			break;
		}

	}
}