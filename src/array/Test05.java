package array;

import java.util.Arrays;

//测试Arrays类
public class Test05 {
	public static void main(String[] args) {
		int[] a = { 1, 2 };
		System.out.println(a);
		System.out.println(Arrays.toString(a));// 打印数组
		for (int i : a) {
			System.out.println(i);
		}

		int[] b = { 1, 2, 323, 23, 543, 12, 59 };
		System.out.println(Arrays.toString(b));
		Arrays.sort(b);// 数组排序
		System.out.println(Arrays.toString(b));
		// 返回排序后新的索引位置，若未找到返回复数
		System.out.println("index is:" + Arrays.binarySearch(b, 12));

		int[] c = { 1, 2, 323, 23, 543, 12, 59 };
		System.out.println(Arrays.toString(c));
		Arrays.fill(c, 2, 4, 100);// 将[2,4)索引的元素替换为100
		System.out.println(Arrays.toString(c));
	}
}