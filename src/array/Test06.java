package array;

import java.util.Arrays;

public class Test06 {
	public static void main(String[] args) {
		int[][] a = new int[3][];

		System.out.println(a[0]);
		a[0] = new int[2];
		System.out.println(a[0]);

		System.out.println(a[0][0]);
		a[0][0] = 1;
		System.out.println(a[0][0]);

		a[1] = new int[3];
		a[2] = new int[4];
		// int[][] a1 = new int[][4];//非法

		int[][] b = { { 1, 2, 3 }, { 3, 4 }, { 3, 5, 6, 7 } };
		System.out.println(Arrays.toString(b[2]));

		int[][] c = new int[3][];
		// c[0]= {1,2,5};//错误，没有声明类型就初始化
		c[0] = new int[] { 1, 2 };
		c[1] = new int[] { 2, 2 };
		c[2] = new int[] { 2, 2, 3, 4 };
		System.out.println(c[2][3]);
		System.out.println(Arrays.toString(c[0]));
		System.out.println(Arrays.toString(c[1]));
		System.out.println(Arrays.toString(c[2]));
	}
}