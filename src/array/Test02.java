package array;

public class Test02 {
	public static void main(String[] args) {
		int[] a = { 10, 20, 30, 40 };
		Man men[] = { new Man(1, 11), new Man(2, 22) };

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

		System.out.println();

		for (int i = 0; i < men.length; i++) {
			System.out.print(men[i].getAge() + " ");
			System.out.print(men[i].getId() + " ");
			System.out.println();
		}

		@SuppressWarnings("unused")
		int b[] = new int[2];// 默认值:0,0
		
		@SuppressWarnings("unused")
		boolean c[] = new boolean[2];// 默认值:false,false
		
		String d[] = new String[2];// 默认值:null,null
		
		/*
		 * for-each是专门用于读取数组或容器中所有的元素
		 * for-each增强for循环在遍历数组过程中不能修改数组中某元素的值
		 * for-each仅适用于遍历，不涉及有关索引的操作
		 *  
		 * */
		d[0]="aa";
		d[1]="bb";
		for (String temp : d) {
			System.out.println(temp);
		}
	}
}