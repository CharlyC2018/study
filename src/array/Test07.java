package array;

import java.util.Arrays;

//使用二维数组保存表格数据
public class Test07 {
	public static void main(String[] args) {
		Object[] a1 = { 1001, "高淇", 18, "讲师", "2-14" };
		Object[] a2 = { 1002, "高小七", 19, "助教", "10-10" };
		Object[] a3 = { 1003, "高小琴", 20, "班主任", "5-5" };
		Object[][] emps = new Object[3][];
		emps[0] = a1;
		emps[1] = a2;
		emps[2] = a3;
		System.out.println(Arrays.toString(a1));
		System.out.println(Arrays.toString(a2));
		System.out.println(Arrays.toString(a3));

		for (int i = 0; i < emps.length; i++) {
			for (Object objects : emps[i]) {
				System.out.print(objects + "\t");
			}
			System.out.println();
		}
	}
}